package com.io;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName:IOExceptionTest02
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 15:26
 * @Description: TODO
 */
public class IOExceptionTest02 {

    /**
     * JDK1.7的新特性
     * @param args
     */
    public static void main(String[] args) {

        try(    //JDK1.7的新特性  处理IO异常
                //读取
                FileInputStream fis = new FileInputStream("C:\\Users\\" +
                        "下马86\\Desktop\\练习文件夹\\a.jpg");
                //写出
                FileOutputStream fos = new FileOutputStream("D:\\upload\\a.jpg")) {

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
                //写出
                fos.write(len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
