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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/10
 * @TIME： 11:27
 * @Description: TODO
 */
@WebServlet("/servletAddContact")
public class ServletAddContact extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、设置请求编码
        request.setCharacterEncoding("utf-8");
        //2、获取所有的请求添加参数
        Map<String, String[]> map = request.getParameterMap();
        Contact contact = new Contact();
        //转javaBean
        try {
            BeanUtils.populate(contact,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //3、调用服务进行添加
        ContactService contactService = new ContactServiceImpl();
        boolean isSuccess = contactService.addContact(contact);
        //如果添加成功，跳转到展示页面
        if(isSuccess){
            response.sendRedirect(request.getContextPath()+"/servletList");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
