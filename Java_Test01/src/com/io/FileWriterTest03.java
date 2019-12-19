package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName:FileWriterTest03
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 15:06
 * @Description: TODO
 */
public class FileWriterTest03 {
    public static void main(String[] args) throws IOException {

        //后面加true表示续写
        FileWriter fw = new FileWriter(
                "D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\d.txt",true);
        for (int i = 0; i < 10; i++) {
            //加\r\n表示换行
            fw.write("helloWord"+i+"\r\n");
        }
        fw.close();
    }
}
