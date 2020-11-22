package com.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @class AnnotationUse
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 12:03
 * @Version 1.0
 */
public class AnnotationUse {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @interface DefineAnnotaion{

    }
}
