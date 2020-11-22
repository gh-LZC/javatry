package com.integration.controller;

import com.integration.entity.Employee;
import com.integration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @class EmployeeController
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/20 22:53
 * @Version 1.0
 */
@Controller(value = "tms")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/createEmployee")
    public void createEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }
}
