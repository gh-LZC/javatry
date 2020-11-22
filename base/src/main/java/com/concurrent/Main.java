package com.concurrent;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/5 21:18
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }};
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        t.start();
        t.join();
        t2.start();
    }

    //线程状态
    public static void printThreatState() {
        System.out.println("");
    }
}
