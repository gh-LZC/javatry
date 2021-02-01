package com.设计模式.UML关系.实现关系;

/**
 * @class Demo
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/6/13 13:35
 * @Version 1.0
 */
public class Demo {
    class A implements B { //A实现B
        @Override
        public void methodB() {

        }
    }

    interface B {
        default void method() {
        }

        void methodB();
        ;
    }
}
