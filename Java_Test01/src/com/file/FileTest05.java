package com.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName:FileTest05
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 20:29
 * @Description: TODO
 */
public class FileTest05 {
    public static void main(String[] args) throws IOException {

        //1、createNewFile();创建文件的方法，前提：给定的file路径一定要存在，否则异常
        File file = new File("C:\\Users\\下马86\\Desktop\\练习文件夹\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

        //删除文件或者文件夹的方法，不走回收站，删除需谨慎
        System.out.println(file.delete());

        //相对路径
        File file2 = new File("c.txt");
        System.out.println(file2.createNewFile());

        //2、mkdir();创建目录（文件夹）的方法，前提：给定的file路径一定要存在 创建单级文件夹
        File file1 = new File("C:\\Users\\下马86\\Desktop\\练习文件夹\\233");
        System.out.println(file1.mkdir());

        //3、mkdirs()创建多级文件夹
        File file3 = new File("C:\\Users\\下马86\\Desktop\\练习文件夹\\233\\2334\\2335");
        System.out.println(file3.mkdirs());
    }
}
