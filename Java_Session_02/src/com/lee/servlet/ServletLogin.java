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
 * @DATE：2020/01/07
 * @TIME： 19:31
 * @Description: TODO
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、请求编码
        request.setCharacterEncoding("utf-8");
        //2、获取所有要进行比较判断的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        //3、获取生成的验证码
        String code_session = (String) request.getSession().getAttribute("code_session");
        //获取session后立刻删除
        request.getSession().removeAttribute("code_session");
        //先判断验证码是否正确
        if(code_session != null && code_session.equalsIgnoreCase(checkCode)){
            //验证码正确，就比对用户名与密码
            if("zhangsan".equals(username) && "123".equals(password)){
                //用户名密码正确
                request.getSession().setAttribute("user",username);
                response.sendRedirect(request.getContextPath()+"/success.jsp");
            }else {
                //错误
                request.setAttribute("login_error","用户名或者密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }

        }else {
            //设置错误提示信息
            request.setAttribute("code_error","验证码错误");
            //验证码错误,转发到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        //再判断用户与密码是否正确
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
