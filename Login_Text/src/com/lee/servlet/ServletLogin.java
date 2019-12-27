package com.lee.servlet;

import com.lee.dao.UserDao;
import com.lee.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/27
 * @TIME： 16:17
 * @Description: TODO
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        //1、获取页面传过来的参数
        /*String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);*/
        //使用BeanUtils可以接收任意个数的参数
        User user = new User();
        Map<String, String[]> map = request.getParameterMap();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //2、创建dao
        UserDao userDao = new UserDao();
        User loginUser = userDao.login(user);

        //3、判断查询是否正确
        if(loginUser!=null){
            //登录成功
            request.setAttribute("user",loginUser);
            //跳转登录成功页面
            request.getRequestDispatcher("/success").forward(request,response);
        }else {
            //登录失败
            request.getRequestDispatcher("/fail").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
