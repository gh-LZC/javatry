package com.frame.spring.aop;

import org.springframework.stereotype.Service;

/**
 * @class DemoAnnotationService
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 17:30
 * @Version 1.0
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解拦截add")
    public void add() {
    }
}
