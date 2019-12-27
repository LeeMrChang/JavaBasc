package com.lee.servlet;

import com.lee.domain.User;

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
 * @TIME： 16:17
 * @Description: TODO
 */
@WebServlet("/success")
public class ServletSuccess extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //如果有中文设置乱码
        response.setContentType("text/html;charset=utf-8");
        //获取request域中的值
        User user = (User) request.getAttribute("user");
        response.getWriter().write(user.getUsername()+"登录成功！");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
