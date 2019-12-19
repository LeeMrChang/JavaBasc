package com.BufferedIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName:BufferedFileInputStreamTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 12:48
 * @Description: TODO
 */
public class BufferedFileInputStreamTest01 {

    public static void main(String[] args) throws IOException {
        //1、读取字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\BufferedIO\\a.txt");
        //2、创建读取字节输入流的缓冲区
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3、创建字节数组来辅助读取
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!=-1){
            System.out.println(new java.lang.String(bytes,0,len));
        }
        //4、关闭流，这里只要关闭缓冲流就可以了，会自动将字节输入流也关闭
        bis.close();
    }
}
