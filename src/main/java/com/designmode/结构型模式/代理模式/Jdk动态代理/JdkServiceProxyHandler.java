package com.designmode.结构型模式.代理模式.Jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @class ServiceProxy
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/26 15:36
 * @Version 1.0
 */
public class JdkServiceProxyHandler implements InvocationHandler {
    Object service;
    
    public Object bindProxyInstance(Object serviceImpl) {
        this.service = serviceImpl;
        return Proxy.newProxyInstance(serviceImpl.getClass().getClassLoader(),
                serviceImpl.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理方法调用开始-->");
        if (method.getName().equals("dealService")) {
            int invoke = (int) method.invoke(service, args);
            System.out.println("<--动态代理方法dealService调用开始-->");
            return invoke;
        } else {
            String string = (String) method.invoke(service, args);
            System.out.println("动态代理方法sayService调用开始");
            return string;
        }
    }
}
