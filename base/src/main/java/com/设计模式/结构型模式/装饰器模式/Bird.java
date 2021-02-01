package com.设计模式.结构型模式.装饰器模式;

/**
 * @class Bird
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/2 15:49
 * @Version 1.0
 */
public class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("用翅膀飞.");
    }
}
