package com.lee.Servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName:ServletDemo01
 * @Author：Mr.lee
 * @DATE：2019/12/26
 * @TIME： 17:00
 * @Description: TODO
 */
public class ServletDemo01 implements Servlet {
    /**
     * 初始化方法
     * 在Servlet被创建时，执行。只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");
    }

    /**
     * Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次Servlet被访问时，执行。可以执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("调用Servlet....");
    }

    /**
     * 获取Servlet的一些信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在Servlet被正常关闭时，执行，只会执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy....");
    }
}
