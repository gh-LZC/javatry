package com.base.computeSign;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/22 16:26
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args){
      int a = 0;
      int b = 0;
      int c = 0;
        System.out.println("a:"+ ++a+"b:"+ ++b+"c:"+c);
        c = a++ + b++;
        System.out.println("a:"+a+"b:"+b+"c:"+c);

    }
}
