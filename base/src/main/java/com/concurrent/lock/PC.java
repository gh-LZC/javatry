package com.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @class PC
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/14 0:46
 * @Version 1.0
 */
public class PC {
    public static void main(String[] args) {
        PC p = new PC();
        Shared s = p.new Shared();
        p.new Producer(s).start();
        p.new Consumer(s).start();
    }

    class Shared {
        private char c;
        private volatile boolean available;
        private final Lock lock;
        private Condition condition;

        Shared() {
            available = false;
            lock = new ReentrantLock();
            condition = lock.newCondition();
        }

        Lock getLock() {
            return lock;
        }

        char getSharedChar() {
            lock.lock();
            try {
                while (!available)
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                available = false;
                condition.signal();
            } finally {
                lock.unlock();
                return c;
            }
        }

        void setSharedChar(char c) {
            lock.lock();
            try {
                while (available)
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                this.c = c;
                available = true;
                condition.signal();
            } finally {
                lock.unlock();
            }
        }
    }

    class Producer extends Thread {
        private final Lock l;
        private final Shared s;

        Producer(Shared s) {
            this.s = s;
            l = s.getLock();
        }

        @Override
        public void run() {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                l.lock();
                s.setSharedChar(ch);
                System.out.println(ch + " produced by producer.");
                l.unlock();
            }
        }
    }

    class Consumer extends Thread {
        private final Lock l;
        private final Shared s;

        Consumer(Shared s) {
            this.s = s;
            l = s.getLock();
        }

        @Override
        public void run() {
            char ch;
            do {
                l.lock();
                ch = s.getSharedChar();
                System.out.println(ch + " consumed by consumer.");
                l.unlock();
            } while (ch != 'z');
        }
    }
}
