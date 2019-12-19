package com.BufferedIO;

import java.io.*;

/**
 * @ClassName:BufferedTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 12:51
 * @Description: TODO
 */
public class BufferedTest01 {

    public static void main(String[] args) throws IOException {
        //输入流(读取)
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream("C:\\Users\\下马86\\Desktop\\练习文件夹\\a.jpg"));
        //输出流
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream("D:\\upload\\a.jpg"));
        long startTime = System.currentTimeMillis();
        //先读取再写出
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=bis.read(bytes))!=-1){
            //写出
            bos.write(len);
        }
        //关闭流
        bos.close();
        bis.close();
        long endTime = System.currentTimeMillis();
        System.out.println("复制毫秒数："+(endTime-startTime));
    }
}
