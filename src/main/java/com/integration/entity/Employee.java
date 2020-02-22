package com.integration.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @class User
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/19 10:34
 * @Version 1.0
 */
@Data
@Alias(value = "employee")
public class Employee implements Serializable {
    private long employeeId;
    private String employeeName;
    private String employeePhone;
    private String employeeEmail;

}
