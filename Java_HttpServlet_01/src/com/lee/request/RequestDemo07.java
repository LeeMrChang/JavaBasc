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
@WebServlet("/requestDemo07")
public class RequestDemo07 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("08被访问了....");
        //往request域中设置数据
        request.setAttribute("msg","hello");
        //请求转发到某地方
        request.getRequestDispatcher("/requestDemo08").
                forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
