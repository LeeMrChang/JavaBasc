package com.io;


import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName:InputStreamTest02
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 14:06
 * @Description: TODO
 */
public class InputStreamTest02 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\a.txt");

        //一次读物多个字节，需要定义一个字节数组来对读取的过程进行缓冲,读取1024个字节
        byte[] bytes = new byte[1024];
        //定义一个变量来接收读取的文件的字节长度
        int len = 0;
        //在不知道文件字节多大的情况下使用white循环
        while ((len = fis.read(bytes))!=-1){
            //读取输出内容，可以使用String类的构造方法对字节数组进行转换打印
            //System.out.println(new String(bytes));
            //bytes代表要读取的文件字节数组，offset代表从哪里开始去取，len代表要读取的字节长度
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
    }
}
