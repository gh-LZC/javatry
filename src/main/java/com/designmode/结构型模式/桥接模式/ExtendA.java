package com.designmode.结构型模式.桥接模式;

/**
 * @class ExtendA
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/5 13:04
 * @Version 1.0
 */
public class ExtendA extends Abstraction {
    public ExtendA(Implementor implementor, String name) {
        super(implementor, name);
    }

    @Override
    void abstractMethod() {
        System.out.println("extenda");
        implementor.implMethod();
    }
}
