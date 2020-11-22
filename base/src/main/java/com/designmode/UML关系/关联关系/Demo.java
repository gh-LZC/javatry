package com.designmode.UML关系.关联关系;

import java.util.List;

/**
 * @class Demo
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/6/13 13:35
 * @Version 1.0
 */
public class Demo {
    class Company { //-->A关系B，把B做自己的成员
       List<Employee> employeeList;
    }
    class Employee {}
}
