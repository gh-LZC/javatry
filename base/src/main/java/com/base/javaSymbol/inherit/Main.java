package com.base.javaSymbol.inherit;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/12 22:00
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentChildClass();
        parentClass.publicMehtod();
        ParentChildClass parentChildClass = new ParentChildClass();
        parentChildClass.publicMehtod();

    }
}
