package com.integration.service;

import com.integration.entity.Employee;
import com.integration.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @class EmployeeServiceImpl
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/19 10:51
 * @Version 1.0
 */
@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public int addEmployee(Employee employee) {
        if (employee == null) {
            System.out.println("员工数据为空！");
        }
        int a = employeeMapper.insertEmployee(employee);
        System.out.println(a);
        return a;
    }

    @Override
    public int deleteEmployee(Employee employee) {
        return 0;
    }

    @Override
    public int modifyEmployee(Employee employee) {
        return 0;
    }

    @Override
    public Employee queryEmployee(Employee employee) {
        return null;
    }
}
