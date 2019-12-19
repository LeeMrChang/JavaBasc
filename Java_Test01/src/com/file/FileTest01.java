package com.file;

import java.io.File;

/**
 * @ClassName:FileTest01
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 19:26
 * @Description: TODO
 */
public class FileTest01 {

    public static void main(String[] args) {

        //获取路径分隔符，windows 分好 ;  linux 冒号 :
        String separator = File.pathSeparator;
        System.out.println(separator);

        //获取文件名称分隔符 windows 反斜杠 \   linux 正斜杠 /
        String s = File.separator;
        System.out.println(s);
    }
}
