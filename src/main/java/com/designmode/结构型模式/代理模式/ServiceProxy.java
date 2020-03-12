package com.designmode.结构型模式.代理模式;

/**
 * @class ServiceProxy
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/26 17:21
 * @Version 1.0
 */
public class ServiceProxy implements Service {
    private ServiceImpl serviceImpl;
    private String serviceName;

    public ServiceProxy(String serviceName) {
        this.serviceName = serviceName;
        if (serviceImpl == null) {
            serviceImpl = new ServiceImpl(serviceName);
        }
    }

    @Override
    public int dealService() {
        //TODO 代理特有的逻辑
        System.out.println("通过代理执行:dealService");
        return serviceImpl.dealService();
    }

    @Override
    public String sayService() {
        //TODO 代理特有的逻辑
        System.out.println("通过代理执行:sayService");
        return serviceImpl.sayService();
    }
}
