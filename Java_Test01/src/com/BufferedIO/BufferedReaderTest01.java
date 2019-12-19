package com.BufferedIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName:BufferedReaderTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 13:21
 * @Description: TODO
 */
public class BufferedReaderTest01 {

    public static void main(String[] args) throws IOException {
        //1、创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("Java_Test01/src/com/BufferedIO/b.txt"));
        //2、读取数据
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
