package com.file;

import java.io.File;

/**
 * @ClassName:FileTest02
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 19:47
 * @Description: TODO
 */
public class FileTest02 {
    public static void main(String[] args) {
        //1、获取文件路径
        File file = new File("C:\\Users\\下马86\\Desktop\\练习文件夹");
        System.out.println(file);

        //2、获取文件路径
        File file1 = new File("C:\\", "练习文件夹");
        System.out.println(file1);

        //3、获取文件路径1
        File file2 = new File(file1, "a.txt");
        System.out.println(file2);
    }
}
