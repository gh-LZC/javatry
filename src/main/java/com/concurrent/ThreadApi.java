package com.concurrent;

/**
 * @class ThreadApi
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/12 13:01
 * @Version 1.0
 * @throws  IllegalArgumentException
 */
public class ThreadApi {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        ThreadApi.MyThread mainThread = new ThreadApi().new MyThread();
        mainThread.testClond();

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
                System.out.println("runnable");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("runnable");
        };
        Thread thread = new Thread(r);
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.println("main thread end");
    }

    public static void construction(){
        Thread mainThread = Thread.currentThread();
        mainThread.setDaemon(true);
        Thread thread = new Thread();
        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("runnable");};
        Thread thread1 = new Thread(r);
        thread1.setDaemon(true);
        thread1.start();
        String threadName = "threadName-a";
        thread1.setName(threadName);
        Thread thread2 = new Thread(threadName);
        ThreadGroup threadGroup = new ThreadGroup("");
        Thread thread3 = new Thread(threadGroup,threadName);
        thread.getThreadGroup();
    }

    class MyThread extends Thread{
        public void testClond() throws CloneNotSupportedException {
            this.clone();
        }
    }
}
