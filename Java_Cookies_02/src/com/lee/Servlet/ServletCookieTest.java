package com.lee.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/05
 * @TIME： 22:06
 * @Description: TODO
 */
@WebServlet("/ServletCookieTest")
public class ServletCookieTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        //1、获取cookies
        Cookie[] cookies = request.getCookies();
        //设置一个标记，如果true表示有lastTime
        boolean flag = false;
        //判断cookie中是否有lastTime存在，有为不是第一次访问，没有为第一次访问
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                //获取cookie的key
                String name = cookie.getName();
                if ("lastTime".equals(name)) {
                    //有lastTime的情况，不是第一次访问
                    flag = true;
                    //设置一个登陆时间
                    Date date = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = format.format(date);
                    System.out.println("解码前："+str_date);
                    //URL解码
                    str_date = URLEncoder.encode(str_date,"utf-8");
                    System.out.println("解码后："+str_date);
                    cookie.setValue(str_date);
                    //设置响应数据
                    cookie.setMaxAge(30 * 30 * 24);
                    //写出cookie
                    response.addCookie(cookie);

                    String value = cookie.getValue();
                    System.out.println("sss"+value);
                    //解码
                    value = URLDecoder.decode(value,"utf-8");
                    System.out.println("fff"+value);
                    response.getWriter().write("<h1>欢迎回来，您上次访问时间为：" + value + "<h1/>");
                    break;
                }
            }
        }

        //如果cookie中没有lastTime,是第一次访问
        if (cookies == null || cookies.length == 0 || flag == false) {
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = format.format(date);
            str_date = URLEncoder.encode(str_date,"utf-8");
            Cookie lastTime = new Cookie("lastTime", str_date);
            lastTime.setMaxAge(30 * 30 * 24);
            //响应cookie对象
            response.addCookie(lastTime);
            URLDecoder.decode(lastTime.getValue(),"utf-8");
            response.getWriter().write("<h1>您好！欢迎您首次访问<h1/>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
