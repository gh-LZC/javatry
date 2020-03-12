package com.designmode.创建型模式.创造者模式;

import lombok.Data;

import java.util.List;

/**
 * @class Director-指挥者
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/28 19:12
 * @Version 1.0
 */
@Data
abstract public class Director {
    private Builder builder;

    public Director(Builder builder) {
        super();
        this.builder = builder;
    }

    public abstract List construct();
}
