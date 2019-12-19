package com.file;

import java.io.File;

/**
 * @ClassName:FileTest04
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 20:22
 * @Description: TODO
 */
public class FileTest04 {
    public static void main(String[] args) {

        //1、exists()判断file表示的文件是否存在
        File file = new File("C:\\Users\\下马86\\Desktop\\练习文件夹");
        System.out.println(file.exists());

        //2、isDirectory();前提：file表示的文件必须存在，判断file是否以目录(文件夹)结尾
        if(file.exists()){
            //true
            System.out.println(file.isDirectory());
        }

        //isDirectory();与isFile();这两个方法是互拆的

        //3、isFile();前提：file表示文件必须存在，判断file是否以文件结尾
        if(file.exists()){
            //false
            System.out.println(file.isFile());
        }
    }
}
