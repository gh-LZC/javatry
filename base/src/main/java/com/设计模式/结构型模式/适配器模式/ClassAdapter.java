package com.设计模式.结构型模式.适配器模式;

/**
 * @class ClassAdapter
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/1 23:16
 * @Version 1.0
 */
public class ClassAdapter extends OldImpl implements NewInterface {
    @Override
    public void newPlug() {
        System.out.println("通过继承旧接口实现类，进行适配：");
        pulg();
    }
}
