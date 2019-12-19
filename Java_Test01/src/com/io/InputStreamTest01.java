package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channel;

/**
 * @ClassName:InputStreamTest01
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 13:43
 * @Description: TODO
 */
public class InputStreamTest01 {

    public static void main(String[] args) throws IOException {
        //1、创建一个字节输入流
        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\b.txt");
        //2、调用读取的方法,读取单个
        System.out.println(fis.read());
        /*读取全部，定义一个变量来接收，字节
           len = fis.read()  赋值操作，将读取的字节赋值给len
           len = fis.read())!=-1  判断操作，当等于-1时，说明已经读取完毕
           如果已经读取完毕字节的情况，每次读取只会返回-1
        */
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.print((char) len);
        }
        //3、关闭流
        fis.close();

    }
}
