package com.frame.spring.configtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @class ScopeTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/24 17:27
 * @Version 1.0
 *一、Spring定义了多种作用域:
 * 1.单例（Singleton）：在整个应用中，只创建bean的一个实例。
 * 2.原型（Prototype）：每次注入或者通过spring应用上下文获取的时候，都会创建一个新的bean实例。
 * 3.会话（Session）：在web应用中，为每个会话创建一个bean实例。
 * 4.请求（Request）：在Web应用中，为每个请求创建一个bean实例。
 */
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = com.frame.spring.configtest.ValueTest.class)})
@Component
public class ScopeTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeTest.class);
        SingleBean singleBean1 = context.getBean(SingleBean.class);
        SingleBean singleBean2 = (SingleBean)context.getBean(SingleBean.class);
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println(" @Scope(value = \"singleton\") singleBean1.equals(singleBean2) = "+ singleBean1.equals(singleBean2));
        System.out.println(" @Scope(value = \"prototype\") prototypeBean1.equals(prototypeBean2) = "+ prototypeBean1.equals(prototypeBean2));
    }

    public ScopeTest() {
    }

    @Component
    @Scope(value = "singleton")//单实例
    class SingleBean{
        public void say(){
            System.out.println("singleton");
        }
    }

    @Component
    @Scope(value = "prototype")//多实例
    class PrototypeBean{

    }

}



