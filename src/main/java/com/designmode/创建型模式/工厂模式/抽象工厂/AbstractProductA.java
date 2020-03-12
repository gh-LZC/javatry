package com.designmode.创建型模式.工厂模式.抽象工厂;

import lombok.Data;

/**
 * @class AbstractProduct
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/29 16:59
 * @Version 1.0
 */
@Data
abstract public class AbstractProductA {
    private String name;
    public void productAdo(){
        System.out.println(getName()+"运作");
    }
}
