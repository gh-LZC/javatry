package com.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @class ExchangerTest
 * @Author Administrator
 * @Description 交换器
 * @Date 2020/1/7 22:00
 * @Version 1.0
 */
public class ExchangerTest {
    public static void main(String[] args) {
        final Exchanger<String> exchanger = new Exchanger<>();
        Runnable cr = () -> {
            try {
                //Thread.currentThread().setName("生产者");
                String qian = exchanger.exchange("收货");
                System.out.println(Thread.currentThread().getName() + qian);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable pr = () -> {
            try {
                //Thread.currentThread().setName("消费者");
                String huowo = exchanger.exchange("收钱");
                System.out.println(Thread.currentThread().getName() + huowo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(cr);
        executorService.submit(pr);
        //executorService.submit(pr);
        executorService.shutdown();
    }

}
