package com.设计模式.创建型模式.建造者模式;

/**
 * @class BuilderImplA
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/28 19:07
 * @Version 1.0
 */
public class BuilderImplA extends Builder {

    @Override
    public void createFoodA() {
        getProductList().add("辣鸡汉堡");
    }

    @Override
    public void createFoodB() {
        getProductList().add("小薯条");
    }

    @Override
    public void createDrink() {
        getProductList().add("奶昔");
    }

    @Override
    public void createAddition() {
        getProductList().add("喜洋洋玩具");
    }
}
