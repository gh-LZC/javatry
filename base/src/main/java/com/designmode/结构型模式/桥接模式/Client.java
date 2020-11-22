package com.designmode.结构型模式.桥接模式;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/5 13:10
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args){
      Abstraction abstraction = new ExtendA(new ImplB(),"client");
      abstraction.abstractMethod();
    }
}
