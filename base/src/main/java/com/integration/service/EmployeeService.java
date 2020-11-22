package com.integration.service;

import com.integration.entity.Employee;

public interface EmployeeService {
    int addEmployee(Employee employee);
    int deleteEmployee(Employee employee);
    int modifyEmployee(Employee employee);
    Employee queryEmployee(Employee employee);
}
