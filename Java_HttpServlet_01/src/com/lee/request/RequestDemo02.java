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
 * @DATE：2019/12/26
 * @TIME： 21:29
 * @Description: TODO
 */
@WebServlet("/req01")
public class RequestDemo02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取请求头指定信息的值
        String header = request.getHeader("User-Agent");
        //判断是谷歌或者是火狐浏览器
        if(header.contains("Chrome")){
            System.out.println("guge...");
        }else if(header.contains("Firefox")){
            System.out.println("huohu...");
        }
    }
}
