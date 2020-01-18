package com.lee.web.servlet;

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
 * @TIME： 17:17
 * @Description: TODO
 */
@WebServlet("/servletDeSelected")
public class ServletDeSelected extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] uids = request.getParameterValues("uid");
        ContactService contactService = new ContactServiceImpl();
        contactService.deleteUids(uids);
        response.sendRedirect(request.getContextPath()+"/servletList");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
