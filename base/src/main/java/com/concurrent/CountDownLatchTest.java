package com.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

/**
 * @class CountDownLatchTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/6 21:11
 * @Version 1.0
 */
public class CountDownLatchTest {
    public static void main(String[] args){
        waitForThread();
    }

    //思路一，单程等待各子线程完成，数据加入任务
    public static void waitForThread(){
        final List<String> list = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(2);

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "门闩递减1");
            list.add(Thread.currentThread().getName());
            countDownLatch.countDown();
        };
        Runnable r2 = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + "需要等待门闩！");
                countDownLatch.await();
                System.out.println(Thread.currentThread().getName() + "等待门闩完成！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(r2).start();
        IntStream.range(0, 2).forEach(i -> new Thread(r).start());
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "所等待的线程都已经完全执行！输出统计结果");
        list.stream().forEach(s -> System.out.println(s));
    }
}
