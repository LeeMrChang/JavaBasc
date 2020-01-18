package com.lee.web.servlet;

import com.lee.domain.Contact;
import com.lee.domain.PageBean;
import com.lee.service.ContactService;
import com.lee.service.impl.ContactServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/13
 * @TIME： 14:26
 * @Description: TODO
 */
@WebServlet("/getByPage")
public class ServletFindByPageContact extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //1、接收参数,当前页
        String currentPage = request.getParameter("currentPage");
        String pageSize = request.getParameter("pageSize");
        //判断如果两个接收的参数如果为空或者空字符串
        if(currentPage == null ||"".equals(currentPage)){
            currentPage = "1";
        }
        if(pageSize == null || "".equals(pageSize)){
            pageSize = "5";
        }
        //分页查询测条件
        Map<String, String[]> condition = request.getParameterMap();
        //将分页条件存进request域中
        request.setAttribute("condition",condition);
        //2、调用service
        ContactService service = new ContactServiceImpl();
        PageBean<Contact> pageBean = service.findByPageContact(currentPage,pageSize,condition);

        //3、存进域中
        request.setAttribute("pageBean",pageBean);
        //4、跳转页面
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
