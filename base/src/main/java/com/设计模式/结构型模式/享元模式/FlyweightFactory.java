package com.设计模式.结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @class FlyweightFatory
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/21 22:09
 * @Version 1.0
 */
public class FlyweightFactory {
    //定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    //享元工厂
    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;

        if (pool.containsKey(extrinsic)) {    //池中有该对象
            flyweight = pool.get(extrinsic);
            System.out.print("已有 " + extrinsic + " 直接从池中取---->");
        } else {
            //根据外部状态创建享元对象
            flyweight = new FlyweightConcrete(extrinsic);
            //放入池中
            pool.put(extrinsic, flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取出---->");
        }

        return flyweight;
    }

    public static void showStatus(){
        System.out.println("flyweight对象数量:"+pool.size());
        for(Map.Entry entry : pool.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
