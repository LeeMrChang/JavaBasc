package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName:InputStreamTest03
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 14:19
 * @Description: TODO
 */
public class InputStreamTest03 {

    public static void main(String[] args) throws IOException {

        //读取
        FileInputStream fis = new FileInputStream("C:\\Users\\下马86\\Desktop\\练习文件夹\\a.jpg");
        //写出
        FileOutputStream fos = new FileOutputStream("D:\\upload\\a.jpg");
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
            //写出
            fos.write(len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("复制图片的时间："+(end-start)+"毫秒！");
    }
}
