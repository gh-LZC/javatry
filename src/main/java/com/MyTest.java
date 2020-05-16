package com;

import java.io.File;
import java.util.HashMap;

/**
 * @class MyTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/17 9:50
 * @Version 1.0
 */
public class MyTest {
    public static void main(String[] args){
        new File("a.txt").renameTo(new File("a.txt"));
        int i=0;
        System.out.println(++i);
        System.out.println(i);
    }
    public void method(String s,String... args){
        for (String s1:args){
            System.out.println(s1);
        }
    }
}
