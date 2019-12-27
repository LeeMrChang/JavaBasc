package com.lee.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/27
 * @TIME： 9:38
 * @Description: TODO
 */
@WebServlet("/regist")
public class RequestDemo04 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、获取请求体中的数据,需要获取字符流
        BufferedReader reader = request.getReader();
        //2、写出
        String line = null;
        while ((line = reader.readLine())!=null) {
            System.out.println(line);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取所有请求头信息
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.nextElement()!=null){
            System.out.println(headerNames);
        }

    }
}
