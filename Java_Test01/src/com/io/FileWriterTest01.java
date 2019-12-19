package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName:FileWriterTest01
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 14:53
 * @Description: TODO
 */
public class FileWriterTest01 {

    public static void main(String[] args) throws IOException {

        //1、创建字符写出流对象
        FileWriter fw = new FileWriter("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\c.txt");
        //2、写出,这个有点不同，就是写出时，
        // 没有调用flush(刷新);或者close(关闭流);之前，它是不会将字符写到硬盘中去的
        fw.write(97);
        fw.write(98);
        fw.write(99);
        //fw.flush();
        fw.close();
    }
}
