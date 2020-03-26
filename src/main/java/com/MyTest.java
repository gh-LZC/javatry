package com;

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
        System.out.println(new MyTest().equals(new MyTest()));
        String a = "a";
        String b = "b";
        new HashMap<>().equals(new HashMap<>());
        a.equals(b);
    }
    public void method(String s,String... args){
        for (String s1:args){
            System.out.println(s1);
        }
    }
}
