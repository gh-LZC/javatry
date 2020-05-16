package com.frame.spring.configtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @class ProfileTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 20:34
 * @Version 1.0
 */
@Configuration
@ComponentScan
@Component
public class ProfileTest {


    @Profile("dev")
    @Bean(value = "devDemoBean")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Profile("prod")
    @Bean
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifeCycleTest.class);
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileTest.class);
        //context.refresh();
        System.out.println(context.getBean("devDemoBean"));
        //System.out.println(context.getBean(DemoBean.class).getContext());
        context.close();
    }
}
/*@Component
class DemoBean{
    public DemoBean(String context) {
        super();
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String context;
}*/
