package com.lee.serlvet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/06
 * @TIME： 20:14
 * @Description: TODO
 */
@WebServlet("/ServletSession_02")
public class ServletSession_02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、获取Session对象
        HttpSession session = request.getSession();
        //2、获取Session中的数据
        Object msg = session.getAttribute("msg");
        System.out.println(msg);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
