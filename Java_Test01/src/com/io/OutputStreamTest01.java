package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName:OutputStreamTest01
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 11:43
 * @Description: TODO
 */
public class OutputStreamTest01 {
    public static void main(String[] args) throws IOException {

        //1、创建字节输出流，使用绝对路径
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\a.txt");
        //2、调用写入的方法
        fos.write(98);
        //3、关闭流
        fos.close();
    }
}
