package com.设计模式.结构型模式.代理模式;

/**
 * @class ServiceImpl
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/26 15:35
 * @Version 1.0
 */
public class ServiceImpl implements Service {
    private String serviceName;

    public ServiceImpl(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public int dealService() {
        System.out.println("ServiceImpl dealService:" + serviceName);
        return 1;
    }

    @Override
    public String sayService() {
        System.out.println("ServiceImpl sayService:" + serviceName);
        return "讲解业务完成！";
    }
}

