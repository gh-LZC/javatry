package com.frame.spring.ioc;

import lombok.Data;

import java.util.List;

/**
 * @class XmlBean
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/10 0:33
 * @Version 1.0
 */
@Data
public class XmlBean {
    private String title;
    private String author;
    private List<String> works;
    private List<String> goods;
    private Bean bean;
    public void say(){
        System.out.println("i am a xmlBean! the title is " + title);
        System.out.println("i am a xmlBean! the works is " + works);
        System.out.println("i am a xmlBean! the goods is " + goods);
        System.out.println("i am a xmlBean! the author is " + author);
        System.out.println("i am a xmlBean! the bean is " + bean);
    }

    public XmlBean(String title,String author) {
        this.title = title;
        this.author = author;
    }

    public XmlBean(String title, String author, Bean bean) {
        this.title = title;
        this.author = author;
        this.bean = bean;
    }
}
