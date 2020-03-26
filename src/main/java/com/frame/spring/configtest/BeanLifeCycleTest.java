package com.frame.spring.configtest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @class BeanLifeCycle
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/25 22:22
 * @Version 1.0
 */
@Configuration
@ComponentScan
public class BeanLifeCycleTest {
    class BeanWayService{
        public void init(){
            System.out.println("@Bean-init-method");
        }

        public BeanWayService() {
            super();
            System.out.println("初始化构造函数-BeanWayService");
        }

        public void destory(){
            System.out.println("@Bean-destory-method");
        }
    }

    class JSR250WayService{
        @PostConstruct
        public void init(){
            System.out.println("jsr250-init-method");
        }

        public JSR250WayService() {
            super();
            System.out.println("初始化构造函数-JSR250WayService");
        }

        @PreDestroy
        public void destory(){
            System.out.println("jsr250-destory-method");
        }
    }
}
