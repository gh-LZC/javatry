package com.base.string;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/16 10:59
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1==s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("s3==s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));

    }
}
