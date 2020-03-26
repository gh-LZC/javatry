package com.designmode.结构型模式.享元模式;

/**
 * @class FlyweightClient
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/21 22:21
 * @Version 1.0
 */
public class FlyweightClient {
    public static void main(String[] args){
        int extrinsic = 22;
        FlyweightFactory.showStatus();
        Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
        flyweightX.operate(++ extrinsic);

        Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
        flyweightY.operate(++ extrinsic);

        Flyweight flyweightZ = FlyweightFactory.getFlyweight("Z");
        flyweightZ.operate(++ extrinsic);

        Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
        flyweightReX.operate(++ extrinsic);

        Flyweight unsharedFlyweight = new FlyweightUnsharedConcrete("X");
        unsharedFlyweight.operate(++ extrinsic);
        FlyweightFactory.showStatus();
    }
}
