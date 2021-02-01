package com.设计模式.结构型模式.装饰器模式;

/**
 * @class HeadBirdDecorator
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/2 15:56
 * @Version 1.0
 */
public class HeadBirdDecorator extends BirdDecorator {

    public HeadBirdDecorator(Fly fly) {
        super(fly);
    }

    public void head(){
        System.out.print("[装饰头部动作]-");
    }

    @Override
    public void fly() {
        head();
        super.fly();
    }
}
