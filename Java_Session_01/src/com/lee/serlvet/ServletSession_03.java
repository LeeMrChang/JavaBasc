package com.lee.serlvet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2020/01/06
 * @TIME： 20:14
 * @Description: TODO
 */
@WebServlet("/ServletSession_03")
public class ServletSession_03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        System.out.println(session);
        //设置关闭浏览器时，session值不变
        Cookie cookie = new Cookie("JSESSIONID",session.getId());
        cookie.setMaxAge(30*30*24);
        response.addCookie(cookie);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
