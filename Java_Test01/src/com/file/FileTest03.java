package com.file;

import java.io.File;

/**
 * @ClassName:FileTest03
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 19:58
 * @Description: TODO
 */
public class FileTest03 {

    public static void main(String[] args) {

        //1、getAbsolutePath();获取File的绝对路径名字符串
        File file = new File("C:\\Users\\下马86\\Desktop\\练习文件夹");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        //2、getPath();获取File的文件路径的字符串形式,可获取相对路径字符串
        File file1 = new File("a.txt");
        String path = file1.getPath();
        System.out.println(path);

        //3、getName 获取File表示的文件或目录名称，一般都是获取到文件路径的结尾部分
        String name = file.getName();
        System.out.println(name);

        //4、public long length();获取File表示的文件的字节大小
        File file2 = new File("D:\\upload\\3E0BE8A507544A18B8D21BD86EDFECD3_select.jpg");
        long length = file2.length();
        System.out.println(length);

    }
}
