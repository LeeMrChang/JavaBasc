package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName:FileWriterTest02
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 15:01
 * @Description: TODO
 */
public class FileWriterTest02 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\c.txt");
        //一次写出多个字符
        char[] chars = {'a','b','c','d','e'};
        fw.write(chars);
        //写出字符串，自动转换
        fw.write("西交铁发部");
        fw.close();
    }
}
