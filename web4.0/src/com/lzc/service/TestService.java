package com.lzc.service;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @class TestService
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/5/31 0:05
 * @Version 1.0
 */
public class TestService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("very good!");
        System.out.println(req);
        System.out.println(resp);
    }
}
