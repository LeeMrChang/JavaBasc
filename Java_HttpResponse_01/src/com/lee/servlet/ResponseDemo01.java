package com.lee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/31
 * @TIME： 19:46
 * @Description: TODO
 */
@WebServlet("/responseDemo01")
public class ResponseDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("demo01....");

       /* //1.设置状态码302
        response.setStatus(302);
        //2.设置响应头location
        response.setHeader("location","responseDemo02");*/

        //重定向
        response.sendRedirect("responseDemo02");

        //设置响应乱码
        response.setHeader("content-type","text/html;charset=utf-8");
        //简单形式的设置字符响应乱码
        response.setContentType("text/html;charset=utf-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
