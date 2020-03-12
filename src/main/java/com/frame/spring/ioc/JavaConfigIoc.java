package com.frame.spring.ioc;

import lombok.Data;

/**
 * @class JavaConfigIoc
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/10 0:10
 * @Version 1.0
 */
@Data
public class JavaConfigIoc {
    private JavaConfigBean javaConfigBean;
    //混合
    private XmlBean xmlBean;

    public JavaConfigIoc() {
    }

    public JavaConfigIoc(XmlBean xmlBean) {
        this.xmlBean = xmlBean;
    }

    //xmlBean来自xml文件
    public JavaConfigIoc(JavaConfigBean javaConfigBean, XmlBean xmlBean) {
        this.javaConfigBean = javaConfigBean;
        this.xmlBean = xmlBean;
    }
}
