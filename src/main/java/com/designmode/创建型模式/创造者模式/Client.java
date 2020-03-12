package com.designmode.创建型模式.创造者模式;

import java.util.List;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/28 19:21
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args){
        //获取套餐1
        Director director = new DirectorImpl(new BuilderImplA());
        List aList = director.construct();
        System.out.println("套餐1-"+aList);

        //获取套餐2
        director = new DirectorImpl(new BuilderImplB());
        List bList = director.construct();
        System.out.println("套餐2-"+bList);

    }


}
