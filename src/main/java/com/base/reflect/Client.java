package com.base.reflect;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/22 16:51
 * @Version 1.0
 */
public class Client {
    private int a;
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Client.class.newInstance().say();
        new Client().getClass().newInstance().say();
        Class.forName("com.base.reflect.Client").newInstance();
    }

    Client(){}

    Client(int a){
        this.a = a;
    }

    void say(){
        System.out.println("hello world");
    }
}
