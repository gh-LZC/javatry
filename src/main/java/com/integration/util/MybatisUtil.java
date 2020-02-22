package com.integration.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @class MybatisUtil
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/20 15:12
 * @Version 1.0
 */
public class MybatisUtil {
    private volatile static SqlSessionFactory sqlSessionFactory = null;

    public static SqlSessionFactory getSqlSessionFactory() {
        String resource = "mybatis/mybatis-config.xml";
        if (sqlSessionFactory == null) {
            try {
                synchronized (SqlSessionFactory.class) {
                    if (sqlSessionFactory == null) {
                        sqlSessionFactory = buildSqlSessionFactory(resource);
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }

    private static SqlSessionFactory buildSqlSessionFactory(String resource) throws IOException {
        InputStream inputStream;
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
        return sqlSessionFactory;
    }

    private static SqlSessionFactory buildSqlSessionFactoryDecode(String resource) throws IOException {
        InputStream inputStream;
        inputStream = Resources.getResourceAsStream(resource);

        InputStreamReader reader = new InputStreamReader(inputStream);
        Properties properties = new Properties();
        properties.load(reader);
        System.out.println(properties.getProperty("password"));
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
        return sqlSessionFactory;
    }

}
