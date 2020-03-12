package com.designmode.创建型模式.单例模式;

/**
 * @class SingletonHuangry 饿汉式
 * @Author Administrator
 * @Description
 * @Date 2020/2/21 21:56
 * @Version 1.0
 */
public class SingletonHuangry {
    private static final SingletonHuangry singletonHuangry = new SingletonHuangry();
    private SingletonHuangry(){}
    public static SingletonHuangry getInstance(){
        return singletonHuangry;
    }
}

