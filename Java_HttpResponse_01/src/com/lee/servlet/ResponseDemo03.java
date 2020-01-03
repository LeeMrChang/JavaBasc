package com.lee.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/31
 * @TIME： 19:46
 * @Description: TODO
 */
@WebServlet("/responseDemo03")
public class ResponseDemo03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        //1、获取字节输出流，任意输出
        ServletOutputStream sos = response.getOutputStream();
        //2、s输出，默认编码格式不会乱码
        sos.write("你好".getBytes("utf-8"));
        ServletContext servletContext = request.getServletContext();
        ServletContext servletContext1 = this.getServletContext();
        String fileName = "/a.jpg";
        String mimeType = servletContext1.getMimeType(fileName);
        System.out.println(mimeType);
        //获取文件的真是路径
        String realPath = servletContext.getRealPath("/b.txt");
        File file = new File(realPath);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
