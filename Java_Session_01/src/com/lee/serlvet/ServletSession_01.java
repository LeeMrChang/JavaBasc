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
@WebServlet("/ServletSession_01")
public class ServletSession_01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、获取Session对象
        HttpSession session = request.getSession();
        //2、使用Session对象往Session中存数据
        session.setAttribute("msg","hello Session!");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
