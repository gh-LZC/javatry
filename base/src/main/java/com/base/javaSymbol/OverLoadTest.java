package com.base.javaSymbol;

/**
 * @class OverLoadTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/22 11:58
 * @Version 1.0
 */
public class OverLoadTest {
    public void method(){
        System.out.println("method");
    }

    public int method(int a){
        System.out.println("method(int a)");
        return a;
    }

    public void method(long a){
        System.out.println("method(long a)");
    }

    public void method(int a,long b){
        System.out.println("method(long a)");
    }

    public void method(long a,int b){
        System.out.println("method(long a)");
    }

    /*
    * 重载 总结：
    *  1.重载Overload是一个类中多态性的一种表现
    *  2.重载要求同名方法的参数列表不同(参数类型，参数个数甚至是参数顺序)
    *  3.重载的时候，返回值类型可以相同也可以不相同。无法以返回型别作为重载函数的区分标准
    */
}
