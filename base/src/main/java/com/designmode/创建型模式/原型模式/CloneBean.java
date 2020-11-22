package com.designmode.创建型模式.原型模式;

import lombok.Data;

/**
 * @class CloneBean
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/8/5 23:50
 * @Version 1.0
 */
@Data
public class CloneBean implements Cloneable{
    int beanId;
    String beanName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public CloneBean(int beanId, String beanName) {
        this.beanId = beanId;
        this.beanName = beanName;
    }
}
