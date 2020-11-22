package com.designmode.结构型模式.适配器模式;

/**
 * @class OldImpl
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/1 23:00
 * @Version 1.0
 */
public class OldImpl implements OldInterface {
    @Override
    public void pulg() {
        System.out.println("旧接口实现插入.");
    }
}
