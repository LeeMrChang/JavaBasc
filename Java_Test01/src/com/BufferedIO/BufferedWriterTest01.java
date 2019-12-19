package com.BufferedIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName:BufferedWriterTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 13:10
 * @Description: TODO
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws IOException {

        //1、创建缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\BufferedIO\\b.txt",true));
        //2、循环并且换行写出
        for (int i = 0; i < 10; i++) {
            bw.write("受了教训，得了书经的指引！");
            //bw.write("\r\n");
            //新的换行的方法
            bw.newLine();
        }
        //3、关闭流
        bw.close();
    }
}
