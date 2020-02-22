package com.frame.spring.aop;

import lombok.Data;

/**
 * @class XmlIoc
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/10 0:32
 * @Version 1.0
 */
@Data
public class XmlIoc {
    private XmlBean xmlBean;
    private JavaConfigBean javaConfigBean;

    public XmlIoc() {
    }

    public XmlIoc(JavaConfigBean javaConfigBean) {
        this.javaConfigBean = javaConfigBean;
    }
}
