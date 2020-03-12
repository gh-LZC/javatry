package com.designmode.创建型模式.创造者模式;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @class Builder-建造群
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/28 17:07
 * @Version 1.0
 */
@Data
abstract public class Builder {
    //复制的构造对象
    private List productList;
    public void init(){
        productList = new ArrayList();
    }
    /**以下是复杂的创造环节*/
    public void createFoodA(){}
    public void createFoodB(){}
    public void createDrink(){}
    public void createAddition(){}
}
