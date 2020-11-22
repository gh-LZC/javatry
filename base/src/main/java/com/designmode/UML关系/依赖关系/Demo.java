package com.designmode.UML关系.依赖关系;

/**
 * @class Demo
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/6/13 13:35
 * @Version 1.0
 */
public class Demo {
    class A { //-->A依赖B
        void method(B b){}//方法入参依赖
        void method(){B b = new B();}//方法调用依赖
    }
    class B {}
}
