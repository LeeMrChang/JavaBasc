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
 * @TIME： 9:24
 * @Description: TODO
 */
@WebServlet("/demo03")
public class RequestDemo03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取请求头中，数据访问的来源
        String referer = request.getHeader("Referer");
        System.out.println(referer);

        //访问的来源可以用来判断-->防盗链
        if(referer.contains("/demo03")){
            System.out.println("访问通过");
        }else{
            //做盗链，截取访问
            System.out.println("您没有权限访问");
        }

    }
}
