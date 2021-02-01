package com.设计模式.结构型模式.代理模式;

import com.设计模式.结构型模式.代理模式.Jdk动态代理.JdkServiceProxyHandler;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/26 17:26
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Service service = new ServiceProxy("看电视");
        service.dealService();

        //jdk动态代理
        JdkServiceProxyHandler jdkServiceProxyHandler = new JdkServiceProxyHandler();
        Service jdkService = (Service) jdkServiceProxyHandler.bindProxyInstance(new ServiceImpl("看电影"));
        System.out.println(jdkService.dealService());
    }
}
