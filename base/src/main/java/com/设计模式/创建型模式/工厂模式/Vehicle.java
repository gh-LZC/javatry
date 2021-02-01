package com.设计模式.创建型模式.工厂模式;

import lombok.Data;

/**
 * @class Goods
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/24 21:22
 * @Version 1.0
 */
@Data
public abstract class Vehicle {
    private String name;
    abstract public void run();
}
