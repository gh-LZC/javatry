package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @class SpringApplication
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/20 23:33
 * @Version 1.0
 */
@MapperScan(value = "mybatis/*")
@SpringBootApplication
public class BootApplication {
    public static void main(String[] args){
        SpringApplication.run(BootApplication.class);
    }
}
