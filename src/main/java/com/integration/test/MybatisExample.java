package com.integration.test;

import com.integration.entity.Employee;
import com.integration.mapper.EmployeeMapper;
import com.integration.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @class MybatisExample
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/20 15:20
 * @Version 1.0
 */
public class MybatisExample {
    public static void main(String[] args){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSessionFactory().openSession();

            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            System.out.println(employeeMapper.queryEmployeeName());
            Employee employee = new Employee();
            employee.setEmployeeId(3);
            employee.setEmployeeName("name3");
            employee.setEmployeePhone("33");
            employee.setEmployeeEmail("email3");
            //System.out.println(employeeMapper.insertEmployee(employee));
            sqlSession.commit();
            System.out.println(employeeMapper.queryAllEmployee());
            System.out.println("sqlSession.selectList:" + sqlSession.selectList("queryAllEmployee"));
            System.out.println(employeeMapper.queryEmployee(employee));
            System.out.println("sqlSession.selectOne:" +  sqlSession.selectOne("queryEmployee",1L).toString());
        }catch (Exception e){
            System.err.println(e.getMessage());
            e.getStackTrace();
        }finally {
            sqlSession.close();
        }

    }
}
