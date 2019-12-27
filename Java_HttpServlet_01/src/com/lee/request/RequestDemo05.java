package com.lee.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/27
 * @TIME： 14:19
 * @Description: TODO
 */
@WebServlet("/regist2")
public class RequestDemo05 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、根据参数名获取参数值
        String parameter = request.getParameter("username");
        /*System.out.println("post");
        System.out.println(parameter);*/
        //3、获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("----------------");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //2、根据参数名称获取数值的数组
        String[] strings = request.getParameterValues("hobby");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
