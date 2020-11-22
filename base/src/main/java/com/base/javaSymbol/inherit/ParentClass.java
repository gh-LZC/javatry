package com.base.javaSymbol.inherit;

/**
 * @class ParentClass
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/12 21:47
 * @Version 1.0
 */
public class ParentClass {
    private Object privateObject;
    protected Object protectedObject;
    public Object publiceObject;

    private void privateMehtod() {
        System.out.println("ParentClass privateMehtod");
    }

    public void publicMehtod() {
        privateMehtod();
        System.out.println("ParentClass publicMehtod");
    }

    protected void protectedMehtod() {
        System.out.println("ParentClass protectedMehtod");
    }

    class InsertClass{

    }

}


