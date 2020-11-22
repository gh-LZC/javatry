package com.standard;

import com.integration.entity.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @class Jdbc
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/20 11:06
 * @Version 1.0
 */
public class Jdbc {
    public static void main(String[] args) {
        try {
            //1 加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2 创建数据库连接
            //这是一个连接oracle数据库的一个连接字符串，指明连接数据库的URL，可理解为三部分－〉协议(jdbc):子协议(oracle:thin):数据源标识(@localhost:1521:orcl)
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String userName = "lzc";
            String password = "123";
            Connection cn = DriverManager.getConnection(url, userName, password);
            //3 执行sql
            String sql = "select * from employee --where employee_id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            int id = 1;
            //ps.setLong(1, id);
            //4 处理结果
            ResultSet rs = ps.executeQuery();
            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmployeeId(rs.getLong(id));
                e.setEmployeeName(rs.getString("employee_name"));
                e.setEmployeePhone(rs.getString("employee_phone"));
                e.setEmployeeEmail(rs.getString("employee_email"));
                employees.add(e);
            }
            //5 关闭资源
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
            System.out.println(employees);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
