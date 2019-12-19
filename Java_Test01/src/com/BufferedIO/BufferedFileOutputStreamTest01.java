package com.BufferedIO;

import java.io.*;

/**
 * @ClassName:BufferedFeliOutputStreamTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 12:30
 * @Description: TODO
 */
public class BufferedFileOutputStreamTest01 {

    public static void main(String[] args) throws IOException {

        //1、创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\BufferedIO\\a.txt");
        //2、创建字节输出流的缓冲区
        BufferedOutputStream out = new BufferedOutputStream(fos);
        //3、对数据进行输出，其中需要调用flush();方法才会对数据进行刷新写出
        out.write("他不爱哦".getBytes());
        //4、刷新数据
        //out.flush();
        //5、关闭流，关流会自动刷新，第4步可以省略
        out.close();
        fos.close();
    }
}
