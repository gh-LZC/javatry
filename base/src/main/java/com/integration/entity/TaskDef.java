package com.integration.entity;

import lombok.Data;

/**
 * @class task
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/19 10:40
 * @Version 1.0
 */
@Data
public class TaskDef {
    private int taskId;
    private String taskName;
    private String taskLevel;
    private String taskDescription;
}
