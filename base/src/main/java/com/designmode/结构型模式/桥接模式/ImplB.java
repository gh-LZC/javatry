package com.designmode.结构型模式.桥接模式;

/**
 * @class ImplA
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/5 13:08
 * @Version 1.0
 */
public class ImplB implements Implementor {
    @Override
    public void implMethod() {
        System.out.println("ImplB");
    }
}
