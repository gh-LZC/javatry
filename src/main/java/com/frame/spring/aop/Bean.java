package com.frame.spring.aop;

import lombok.Data;

/**
 * @class Bean
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/15 12:16
 * @Version 1.0
 */
@Data
public class Bean {
    private int id;
    private String name;

    public Bean(){

    }

    public Bean(String name) {
        this.name = name;
    }
}
