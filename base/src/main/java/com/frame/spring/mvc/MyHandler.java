package com.frame.spring.mvc;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @class MyHandler
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 17:36
 * @Version 1.0
 */
public class MyHandler implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("请求之前处理");
        String token = request.getParameter("token");
        System.out.println("token=" + token);
        if (StringUtils.isEmpty(token)) {
            response.getWriter().write("token is null");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle方法之后处理");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion方法之后处理");
    }
}
