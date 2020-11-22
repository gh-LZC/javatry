package com.base.array;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/19 23:31
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args){
        int ints[] = new int[1];
        int ints1[] = {1,2,3};
        char[] chars = new char[1];
        boolean[] booleans = new boolean[1];
        String[] strings = new String[98];
        Object[] objects = new Object[1];
        System.out.println(ints.toString());
//        System.out.println(strings[-1]);
        System.out.println(ints[0]);
        System.out.println(chars[0]);
        System.out.println(booleans[0]);
        System.out.println(strings[0]);
        strings[97] = "a";
        System.out.println(strings['a']);
        System.out.println("strings = " + ints);
        System.out.println("strings = " + strings.toString());
        System.out.println(strings.length);
    }
}
