package com.lee.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ClassName:FilterDemo
 * @Author：Mr.lee
 * @DATE：2020/01/18
 * @TIME： 15:16
 * @Description: TODO
 */
@WebFilter(value = "/*",dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.FORWARD})
public class FilterDemo3 implements Filter {
    /**
     * 在服务器启动后，会创建Filter对象，然后调用init方法，只执行一次，用于加载资源
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 每一次请求被拦截资源时，会执行，执行多次
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("filter 02 ....");

        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    /**
     * 在服务器关闭后，Filter对象被销毁，如果服务器是正常关闭，则会执行destroy方法。
     * 只执行一次，用于释放资源
     */
    @Override
    public void destroy() {

    }
}
