package com.lee.web.servlet;

import com.lee.domain.Contact;
import com.lee.service.ContactService;
import com.lee.service.impl.ContactServiceImpl;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/09
 * @TIME： 17:56
 * @Description: TODO
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、设置请求乱码
        request.setCharacterEncoding("utf-8");
        //2、获取参数
        String verifyCode = request.getParameter("verifycode");
        HttpSession session = request.getSession();
        String code = (String) session.getAttribute("code");
        session.removeAttribute("code");
        //3、判断验证是否正确
        if (!verifyCode.equalsIgnoreCase(code)) {
            //验证码错误
            request.setAttribute("loginMsg", "验证码错误！");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }
        //判断用户登录
        Map<String, String[]> map = request.getParameterMap();
        Contact contact = new Contact();
        //转成javaBean
        try {
            BeanUtils.populate(contact, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //3.1、正确判断用户名与密码
        ContactService contactService = new ContactServiceImpl();
        Contact loginCon = contactService.findLogin(contact);
        if(loginCon!=null){
            //登录成功
            session.setAttribute("contact",loginCon);
            response.sendRedirect(request.getContextPath()+"/success.jsp");
        }else {
            //登录失败！
            request.setAttribute("loginMsg", "用户名或者密码错误！");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
