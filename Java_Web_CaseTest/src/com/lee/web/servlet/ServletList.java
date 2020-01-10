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
import java.util.List;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/10
 * @TIME： 12:30
 * @Description: TODO
 */
@WebServlet("/servletList")
public class ServletList extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doGet(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ContactService contactService = new ContactServiceImpl();
        List<Contact> list = contactService.findAll();
        System.out.println(list);
        request.setAttribute("list",list);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
