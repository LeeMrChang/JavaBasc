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
 * @TIME： 15:30
 * @Description: TODO
 */
@WebServlet("/servletDelete")
public class ServletDelete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、设置请求乱码
        request.setCharacterEncoding("utf-8");
        //获取要删除的主键id参数
        String id = request.getParameter("id");
        ContactService contactService = new ContactServiceImpl();
        boolean isDelete = contactService.delete(id);
        if(isDelete){
            //如果删除成功
            response.sendRedirect(request.getContextPath()+"/servletList");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
