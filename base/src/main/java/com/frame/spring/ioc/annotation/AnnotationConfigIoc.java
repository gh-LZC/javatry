package com.frame.spring.ioc.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @class Ioc
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/8 23:58
 * @Version 1.0
 */
@Data
@Component
public class AnnotationConfigIoc {
    @Autowired
    @Resource
    private AnnotationConfigBean injectBean;
}
