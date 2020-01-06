package com.lee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/05
 * @TIME： 21:05
 * @Description: TODO
 */
@WebServlet("/ServletCookies_01")
public class ServletCookies_01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、创建Cookies对象,并设置cookie的key与value
        Cookie cookie = new Cookie("msg", "hello");
        Cookie cookie1 = new Cookie("msg", "hello");
        //设置cookie的生命周期的三种方式：
        //1、表示在磁盘持久存活30秒
        cookie.setMaxAge(300);
        //2、默认生命周期，浏览器关闭则cookie被清楚
        cookie.setMaxAge(-1);
        //3、cookie被删除
        cookie.setMaxAge(0);
        //2、将cookie添加进客户端中
        response.addCookie(cookie);
        System.out.println("1被访问了。。。");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
