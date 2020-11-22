package com.base.javakeyword;

import lombok.Data;

/**
 * @class AbstractClass
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/31 0:22
 * @Version 1.0
 */
@Data
public abstract  class AbstractClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void init(){
        this.name = "wo";
    }
    public AbstractClass() {
        init();
    }

    static class B extends AbstractClass{

    }

    public static void main(String[] args){
        System.out.println(new AbstractClass.B().getName());
    }
}
