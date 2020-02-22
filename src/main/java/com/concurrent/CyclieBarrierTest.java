package com.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * @class CyclieBarrierTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/6 22:33
 * @Version 1.0
 */
public class CyclieBarrierTest {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        Runnable r0 = () -> {
            System.out.println("所有线程均已经抵达屏障！");
            synchronized (lock){
                lock.notify();
            }
        };

        final CyclicBarrier c = new CyclicBarrier(2, r0);
        Runnable r = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + "抵达屏障 还差几个？：");
                c.await();
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };
        Runnable r2 = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + "抵达屏障 还差几个？：" + c.getNumberWaiting());
                c.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };
        IntStream.range(0, 2).forEach(i -> new Thread(r).start());
        //IntStream.range(0, 1).forEach(i -> new Thread(r2).start());
        synchronized (lock){
            lock.wait();
        }
        System.out.println(c.getNumberWaiting());
    }
}
