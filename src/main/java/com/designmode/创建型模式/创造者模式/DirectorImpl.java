package com.designmode.创建型模式.创造者模式;

import java.util.List;

/**
 * @class DirectorImpl
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/28 19:17
 * @Version 1.0
 */
public class DirectorImpl extends Director {

    public DirectorImpl(Builder builder) {
        super(builder);
    }

    @Override
    public List construct() {
        getBuilder().init();
        getBuilder().createFoodA();
        getBuilder().createFoodB();
        getBuilder().createDrink();
        getBuilder().createAddition();
        return getBuilder().getProductList();
    }
}
