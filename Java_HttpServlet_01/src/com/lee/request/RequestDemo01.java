package com.lee.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/26
 * @TIME： 20:53
 * @Description: TODO
 */
@WebServlet("/req")
public class RequestDemo01 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * 演示获取请求行数据
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、获取请求方式 GET
        String method = request.getMethod();
        System.out.println(method);
        //2、获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //3、获取Servlet路径 /req
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        //4、获取get请求方式的参数 username=sxdfg
        String queryString = request.getQueryString();
        System.out.println(queryString);
        //5、获取请求URI  /req
        String uri = request.getRequestURI();
        System.out.println(uri);
        //http://localhost:8089/req
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        //6、获取协议及版本 HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);
        //7、获取客户机的IP地址  0:0:0:0:0:0:0:1
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
