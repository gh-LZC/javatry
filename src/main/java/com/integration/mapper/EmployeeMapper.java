package com.integration.mapper;

import com.integration.entity.Employee;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {
     List<Employee> queryEmployee(Employee employee);
     @Select(value = "select * from employee")
     @ResultMap(value = "EmployeeMapper")
     List<Employee> queryAllEmployee();
     String queryEmployeeName();
     int insertEmployee(Employee employee);
}
