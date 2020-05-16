package com.frame.spring.configtest;

/**
 * @class DemoBean
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/31 1:13
 * @Version 1.0
 */
public class DemoBean {
    public DemoBean(String context) {
        super();
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String context;
}
