package com.frame.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @class JavaConfig
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/10 0:08
 * @Version 1.0
 */
//@ComponentScan
@Configuration
//@ImportResource("classpath:spring-ioc.xml")
public class JavaConfig {

    @Bean
    public JavaConfigBean javaConfigBean() {
        return new JavaConfigBean();
    }

    @Bean
   //这里会导致注入不了xmlBean
    public JavaConfigIoc javaConfigIoc() {
        JavaConfigIoc javaConfigIoc = new JavaConfigIoc();
        javaConfigIoc.setJavaConfigBean(javaConfigBean());
        return javaConfigIoc;
    }

    @Bean JavaConfigIoc javaConfigIoc2(XmlBean xmlBean,JavaConfigBean javaConfigBean){
            return new JavaConfigIoc(javaConfigBean,xmlBean);
    }

    /*@Bean
    public JavaConfigIoc javaConfigIoc(JavaConfigBean javaConfigBean) {
        JavaConfigIoc javaConfigIoc = new JavaConfigIoc();
        javaConfigIoc.setJavaConfigBean(javaConfigBean);
        return javaConfigIoc;
    }*/
}
