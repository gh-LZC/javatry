package com.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

/**
 * @class SemaphoreTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/11 22:56
 * @Version 1.0
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        final Semaphore semaphore = new Semaphore(2);
        final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Runnable r = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + "-start-" + sf.format(new Date()));
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "-end-" + sf.format(new Date()));
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(2);
        IntStream.range(0, 10).forEach(i -> {
            executor.execute(r);
        });
        executor.shutdown();
        IntStream.range(0,10).forEach(i -> {new Thread(r).start();});
    }
}
