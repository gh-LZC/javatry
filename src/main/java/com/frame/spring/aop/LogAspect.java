package com.frame.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @class LogAspect
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 17:11
 * @Version 1.0
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.frame.spring.aop.Action)")
    public void annotationPointCut(){
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解拦截方式" + action.name());
    }

    @Before("execution(* com.frame.spring.aop..DemoMethodService.*(..))")
    //@Before("execution (* com.frame.spring.aop..*.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截,"+method.getName());
    }
}
