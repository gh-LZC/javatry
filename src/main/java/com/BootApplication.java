package com;

import com.integration.entity.OmUserTask;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @class SpringApplication
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/20 23:33
 * @Version 1.0
 */
@MapperScan(value = "mybatis/*")
@SpringBootApplication
public class BootApplication {
    public static void main(String[] args){
        //SpringApplication.run(BootApplication.class);
        OmUserTask e = new OmUserTask();
        OmUserTask e2 = new OmUserTask();
        OmUserTask e3 = new OmUserTask(2);
        OmUserTask e4 = new OmUserTask(2);

        System.out.println(e.hashCode());
        //e.setOmUserTaskId(1);
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e2.equals(e4));

    }
}
