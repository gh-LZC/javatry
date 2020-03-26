package com.designmode.创建型模式.建造者模式;

/**
 * @class BuilderImplA
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/28 19:07
 * @Version 1.0
 */
public class BuilderImplB extends Builder {

    @Override
    public void createFoodA() {
        getProductList().add("巨无霸汉堡");
    }

    @Override
    public void createFoodB() {
        getProductList().add("大薯条");
    }

    @Override
    public void createDrink() {
        getProductList().add("可乐");
    }

}
