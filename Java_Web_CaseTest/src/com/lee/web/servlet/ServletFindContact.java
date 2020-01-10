package com.lee.web.servlet;

import com.lee.domain.Contact;
import com.lee.service.ContactService;
import com.lee.service.impl.ContactServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/10
 * @TIME： 16:05
 * @Description: TODO
 */
@WebServlet("/servletFindContact")
public class ServletFindContact extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        ContactService contactService = new ContactServiceImpl();
        Contact contact =  contactService.findContact(id);
        //将查询出来的用户对象存到request域中
        request.setAttribute("contact",contact);
        //跳转页面
        request.getRequestDispatcher("update.jsp").forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
