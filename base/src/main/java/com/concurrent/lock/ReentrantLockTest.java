package com.concurrent.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @class ReentrantLockTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/13 9:58
 * @Version 1.0
 */
public class ReentrantLockTest {
    static final ReentrantLock reentrantLock = new ReentrantLock();
    static Condition condition = reentrantLock.newCondition();
    static volatile boolean isPorduce;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable r = () -> {
            reentrantLock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("rr");
            condition.signal();
            reentrantLock.unlock();
        };
        executorService.execute(new ProduceT());
        executorService.execute(new CustomerT());
//        executorService.execute(r);
    }

    static class ProduceT extends Thread {
        @Override
        public void run() {
            while (true) {
                reentrantLock.lock();
                try {
                    System.out.println("produce a");
                    sleep(5000);
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    static class CustomerT extends Thread {
        @Override
        public void run() {
            while (true) {
                reentrantLock.lock();
                System.out.println("customer a");
                try {
                    sleep(5000);
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }
}
