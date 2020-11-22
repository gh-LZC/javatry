package com.base;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/8 22:48
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Runnable r = () -> {
            try {
                m.say();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable r2 = () -> {
                m.dos();
        };
        new Thread(r2).start();
        new Thread(r).start();
    }
    synchronized void say() throws InterruptedException {
        Thread.currentThread().sleep(8000);
        System.out.println("say");
    }

    synchronized void dos(){
        System.out.println("do");
    }
}
