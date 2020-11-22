package com.数据结构与算法;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/11 22:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        forPrint(100000);
        long endTime = System.currentTimeMillis();
        System.out.println("forPrint cost time :" + ((endTime - startTime)));
        startTime = System.currentTimeMillis();
        arround(10000);
        endTime = System.currentTimeMillis();
        System.out.println("arround cost time :" + ((endTime - startTime)));
    }

    public static void forPrint(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("");
        }
    }

    public static void arround(int n) {
        if (n != 0) {
            System.out.printf("");
            arround(n - 1);
        }
    }
}
