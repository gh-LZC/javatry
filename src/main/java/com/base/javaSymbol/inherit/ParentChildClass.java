package com.base.javaSymbol.inherit;

/**
 * @class ParentChildClass
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 14:01
 * @Version 1.0
 */
public class ParentChildClass extends ParentClass {
    @Override
    public void publicMehtod() {
        this.protectedMehtod();
        System.out.println("ParentChildClass publicMehtod");
    }
}
