package com.base.泛型genericity;

/**
 * @class Impl
 * @Author Administrator
 * @Description //TODO
 * @Date 2021/1/9 18:44
 * @Version 1.0
 */
public class Client{
    public static void main(String[] args) throws IllegalAccessException {
        Cl cl = new Cl();
        Bean bean = new Bean();
        bean.id = "1";
        System.out.println(cl.do1(bean));
    }
}
