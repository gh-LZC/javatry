package com.设计模式.结构型模式.装饰器模式;

/**
 * @class HeadBirdDecorator
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/2 15:56
 * @Version 1.0
 */
public class TailBirdDecorator extends BirdDecorator {

    public TailBirdDecorator(Fly fly) {
        super(fly);
    }

    public void tail(){
        System.out.print("[装饰尾巴动作]-");
    }

    @Override
    public void fly() {
        tail();
        super.fly();
    }
}
