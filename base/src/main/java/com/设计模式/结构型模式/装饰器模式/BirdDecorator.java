package com.设计模式.结构型模式.装饰器模式;

/**
 * @class BirdDecorator
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/2 15:51
 * @Version 1.0
 */
public class BirdDecorator implements Fly {
    Fly fly;

    public BirdDecorator(Fly fly) {
        this.fly = fly;
    }

    @Override
    public void fly() {
        fly.fly();
    }
}
