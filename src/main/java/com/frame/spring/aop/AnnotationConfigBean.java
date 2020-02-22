package com.frame.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @class InjectBean
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/9 0:00
 * @Version 1.0
 */
@Component
public class AnnotationConfigBean {
    public void say(){
        System.out.println("i am a annotationConfigBean!");
    }
}
