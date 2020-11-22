package com.base.io;

import com.PathClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @class PropertiesLoad
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/5/16 22:38
 * @Version 1.0
 */
public class PropertiesLoad {
    public static void main(String[] args) throws IOException {
        Properties properties  =  new Properties();
        InputStream in = PropertiesLoad.class.getClassLoader().getResourceAsStream("io/default.properties");
        properties.load(in);
        System.out.println(properties.getProperty("id") + properties.getProperty("name"));
        in.close();
    }
}
