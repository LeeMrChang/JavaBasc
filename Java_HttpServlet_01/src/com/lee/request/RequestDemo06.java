package com.lee.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/27
 * @TIME： 14:19
 * @Description: TODO
 */
@WebServlet("/login")
public class RequestDemo06 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决post请求的中文乱码问题
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        System.out.println(username);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
