package com.frame.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @class HelloBoot
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/14 0:19
 * @Version 1.0
 */
@RestController
public class HelloBoot {
    @RequestMapping("/hello")
    public String index(){
        return "hello word!";
    }
}
