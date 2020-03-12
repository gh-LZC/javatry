package com.frame.spring.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    private AnnotationConfigBean injectBean;
}
