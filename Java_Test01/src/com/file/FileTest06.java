package com.file;

import java.io.File;

/**
 * @ClassName:FileTest06
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 20:58
 * @Description: TODO
 */
public class FileTest06 {
    public static void main(String[] args) {


        File file = new File("C:\\Users\\下马86\\Desktop\\练习文件夹");
        //1、以字符串形式遍历全部文件夹
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------->");

        //2、以文件形式遍历全部文件夹
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
