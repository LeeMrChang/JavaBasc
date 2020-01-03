package com.lee.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/31
 * @TIME： 19:46
 * @Description: TODO
 */
@WebServlet("/download")
public class DownloadTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、获取文件名称
        String filename = request.getParameter("filename");
        ServletContext context = request.getServletContext();
        String realPath = context.getRealPath("/img/"+filename);
        //2、使用字节输入流加载文件进内存
        FileInputStream fis = new FileInputStream(realPath);

        //获取去服务器中的文件类型
        String mimeType = context.getMimeType(filename);
        //3、指定response的响应头：Context-disposition:attachment;filename=xxx
        response.setHeader("content-type",mimeType);
        response.setHeader("context-disposition","attachment;filename"+filename);
        //4、将数据写到response输出流
        ServletOutputStream sos = response.getOutputStream();
        byte[] bffu = new byte[1024*8];
        int len = 0;
        while ((len=fis.read(bffu))!=-1){
            sos.write(bffu,0,len);
        }
        //关闭资源
        fis.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
