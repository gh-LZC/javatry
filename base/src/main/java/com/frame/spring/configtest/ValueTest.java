package com.frame.spring.configtest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @class ValueTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/24 17:24
 * @Version 1.0
 */

/*
* @Value的作用是通过注解将常量、配置文件中的值、其他bean的属性值注入到变量中，作为变量的初始值。
* 一、常量注入
* (1)常量注入 @Value("normal")  private String normal;
* (2)注入文件资源@Value("classpath:com/hry/spring/configinject/config.txt") private Resource resourceFile;
 *(3)注入URL资源@Value("http://www.baidu.com") private Resource testUrl;
 * 二、bean属性、系统属性、表达式注入@Value("#{}")
 * （1）@Value("#{beanInject.another}")
 *     private String fromAnotherBean; // 注入其他Bean属性：注入beanInject对象的属性another
 * （2）@Value("#{systemProperties['os.name']}")
 *     private String systemPropertiesName; // 注入操作系统属性
 * （3）@Value("#{ T(java.lang.Math).random() * 100.0 }") private double randomNumber; //注入表达式结果
 *s三、配置文件属性注入@Value("${}")
* */
@PropertySource("classpath:resource.properties")
@Component
public class ValueTest {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueTest.class);
        ValueTest elConfig = context.getBean(ValueTest.class);
        elConfig.outputResource();
    }

    @Value("1")//字面量
    public int id;
    @Value("我 love 2")
    public String normal;
    @Value("#{systemProperties['os.name']}")
    public String osName;
    @Value("#{T(java.lang.Math).random() * 100.0}")
    public double randomNumber;
    /*不能这样引用自定义方法
    @Value("#{T(com.frame.spring.configtest.ValueTest).returnValue()}")
    public String myClassStaticMethod;*/
    @Value("#{demoService.another}")
    public String fromAnother;
    @Value("classpath:test.txt")
    public Resource localResource;
    @Value("http://www.bai                       du.com")
    public Resource netResource;
    @Value("${resource.name}")
    public String myName;
    @Autowired
    public Environment environment;

    public void outputResource() {
        System.out.println(id);
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(fromAnother);
        System.out.println(randomNumber);
        try {
            System.out.println("netResource" + IOUtils.toString(netResource.getInputStream()));
            System.out.println("localResource" + IOUtils.toString(localResource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("来自自定义配置文件resource.properties" + myName);
        System.out.println(environment.getProperty("resource.name"));
        //System.out.println(myClassStaticMethod);
    }

    @Component("demoService")
    public class DemoService {
        @Value("其他类的属性")
        public String another;
    }
    static String returnValue(){
        return "static returnvalue!";
    }
}
