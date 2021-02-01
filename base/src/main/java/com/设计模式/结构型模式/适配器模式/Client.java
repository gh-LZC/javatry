package com.设计模式.结构型模式.适配器模式;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/1 23:08
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args){
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.newPlug();
        //组合适配器
        CombineAdapter combineAdapter = new CombineAdapter(new OldImpl());
        combineAdapter.newPlug();
    }
}
