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
@WebServlet("/requestDemo08")
public class RequestDemo08 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //从request域中获取数据值
        Object msg = request.getAttribute("msg");
        System.out.println(msg);
        System.out.println("09被访问...");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("09被访问...");
    }
}
