package com.frame.spring.ioc;

import com.frame.spring.ioc.annotation.AnnotationConfigIoc;
import com.frame.spring.ioc.javaconfig.JavaConfig;
import com.frame.spring.ioc.javaconfig.JavaConfigBean;
import com.frame.spring.ioc.javaconfig.JavaConfigIoc;
import com.frame.spring.ioc.javaconfig.JavaConfigXmlConfig;
import com.frame.spring.ioc.xml.Bean;
import com.frame.spring.ioc.xml.XmlIoc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/9 0:35
 * @Version 1.0
 */
@ComponentScan
@Configuration
public class Client {
    public static void main(String[] args){
        showAnnotationConfig();
    }

    public static void showXmlConfig(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-root.xml");
        XmlIoc xmlIoc = context.getBean(XmlIoc.class);
        JavaConfigBean javaConfigBean = context.getBean(JavaConfigBean.class);
        Bean bean = (Bean) context.getBean("com.frame.spring.ioc.xml.Bean#0");
        System.out.println("id:" + (bean.getId()-1) +",name:" + bean.getName());
        xmlIoc.getXmlBean().say();
        javaConfigBean.say();
        //xmlIoc.getJavaConfigBean().say();
    }

    public static void showAnnotationConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Client.class);
        AnnotationConfigIoc annotationIoc = context.getBean(AnnotationConfigIoc.class);
        //AnnotationConfigIoc annotationIoc = (AnnotationConfigIoc)context.getBean("annotationConfigIoc");
        annotationIoc.getInjectBean().say();
    }

    public static void showJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        //JavaConfigIoc javaConfigIoc = context.getBean(JavaConfigIoc.class);
        JavaConfigIoc javaConfigIoc = (JavaConfigIoc)context.getBean("javaConfigIoc");
        javaConfigIoc.getJavaConfigBean().say();
        javaConfigIoc.getXmlBean().say();
    }

    public static void showJavaConfigXmlConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigXmlConfig.class);
//        JavaConfigIoc javaConfigIoc = context.getBean(JavaConfigIoc.class);
        JavaConfigIoc javaConfigIoc = (JavaConfigIoc)context.getBean("javaConfigIoc2");
        javaConfigIoc.getXmlBean().say();
    }

}
