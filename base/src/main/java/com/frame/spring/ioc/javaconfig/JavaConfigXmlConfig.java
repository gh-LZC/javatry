package com.frame.spring.ioc.javaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @class JavaConfigXml
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/18 21:50
 * @Version 1.0
 */
@Configuration
@Import(JavaConfig.class)
@ImportResource("classpath:spring/spring-ioc.xml")
public class JavaConfigXmlConfig {
}
