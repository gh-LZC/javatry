package com.frame.spring.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @class ScheduledTask
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/26 10:04
 * @Version 1.0
 */
@Component
public class ScheduledTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void execute(){
       log.info("当前时间是:" + simpleDateFormat.format(new Date()));
    }
}
