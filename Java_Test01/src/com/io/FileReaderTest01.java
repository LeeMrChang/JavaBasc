package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName:ReaderTest01
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 14:42
 * @Description: TODO
 */
public class FileReaderTest01 {

    public static void main(String[] args) throws IOException {

        //1、创建字符读取流对象
        FileReader fr = new FileReader("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\a.txt");
        //2、读取
        /*int len = 0;
        while ((len=fr.read())!=-1){
            System.out.print((char) len);
        }*/
        //定义数组进行缓存
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        //3、关闭流
        fr.close();

    }
}
