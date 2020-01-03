package com.lee.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * @ClassName:${NAME}
 * @Author：Mr.lee
 * @DATE：2019/12/31
 * @TIME： 19:46
 * @Description: TODO
 */
@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    /**
     * 画验证码案例
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //定义宽与高
        int width = 100;
        int height = 50;
        //1、定义图像缓冲区对象
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_3BYTE_BGR);

        //2、画图与美化，背景颜色
        Graphics graphics = image.getGraphics();
        //设置画笔颜色
        graphics.setColor(Color.pink);
        //画背景
        graphics.fillRect(0,0,width,height);

        //画边框
        graphics.setColor(Color.blue);
        graphics.drawRect(0,0,width-1,height-1);

        //设置要随机生成的字母
        String str = "ABCDEFGHIJKLMNOPQRSTUVWSYZabcdefghijklmnopqrstuvwsyz0123456789";
        //生成随机角标
        Random random = new Random();
        for (int i = 1; i <= 4; i++) {
            int index = random.nextInt(str.length());
            //获取字符
            char at = str.charAt(index);
            //写验证码
            graphics.drawString(at+"",width/5*i,height/2);
        }

        //画干扰线,设置干扰线颜色
        graphics.setColor(Color.cyan);
        //生成随机坐标点
        for (int i = 0; i < 10; i++) {
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);

            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            //写出随机干扰线
            graphics.drawLine(x1,y1,x2,y2);
        }
        //3、将图片输出到页面展示
        ImageIO.write(image,"jpg",response.getOutputStream());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
