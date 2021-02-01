package com.设计模式.结构型模式.享元模式;

/**
 * @class FlyweightUnsharedConcrete
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/21 22:19
 * @Version 1.0
 */
public class FlyweightUnsharedConcrete extends Flyweight {

    public FlyweightUnsharedConcrete(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
