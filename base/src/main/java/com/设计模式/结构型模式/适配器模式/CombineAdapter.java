package com.设计模式.结构型模式.适配器模式;

/**
 * @class Adapter
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/1 23:06
 * @Version 1.0
 */
public class CombineAdapter implements NewInterface {
    OldInterface oldInterface;

    public CombineAdapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void newPlug() {
        System.out.println("通过组合旧接口，进行适配：");
        oldInterface.pulg();
    }
}
