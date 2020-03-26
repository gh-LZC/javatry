package com.designmode.结构型模式.享元模式;

/**
 * @class FlyweightConcrete
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/21 22:17
 * @Version 1.0
 */
public class FlyweightConcrete extends Flyweight {

    public FlyweightConcrete(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:" + extrinsic);
    }
}
