package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName:OutputStreamTest02
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 12:03
 * @Description: TODO
 */
public class OutputStreamTest02 {

    public static void main(String[] args)throws IOException {

        //1、创建字节输出流对象  ？这里为什么写不了相对路径1
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\b.txt",true);
        //2、一次写出多个字节
        fos.write("\r\n".getBytes());
        byte[] bytes = {49,48,48};
        fos.write(bytes);
        byte[] bytes1 = "肚子好饿".getBytes();
        fos.write(bytes1);
        //3、关闭流
        fos.close();
    }
}
