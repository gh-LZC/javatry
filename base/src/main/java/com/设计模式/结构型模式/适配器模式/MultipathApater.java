package com.设计模式.结构型模式.适配器模式;

/**
 * @class MultipathApater
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/1 23:25
 * @Version 1.0
 */
public class MultipathApater implements OldInterface, NewInterface {
    OldInterface oldInterface;

    public MultipathApater(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void newPlug() {
        //这里适配器的实现
    }

    @Override
    public void pulg() {
        oldInterface.pulg();
    }
}
