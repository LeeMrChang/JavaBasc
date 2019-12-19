package com.recursive;

import java.io.File;

/**
 * @ClassName:RecursiveTest04
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 10:59
 * @Description: TODO
 */
public class RecursiveTest04 {
    /**
     * 只遍历打印以.java或者.txt或者.jpg结尾的文件
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\下马86\\Desktop\\练习文件夹");
        show(file);
    }
    public static void show(File dir){
        //1、获取多级文件夹
        File[] files = dir.listFiles();
        for (File file : files) {
            //2、判断是文件夹的
            if(file.isDirectory()){
                show(file);
            }else {
                //3、不是文件夹就是文件的,获取文件的字符串格式
//                file.getName();都是获取文件字符串格式的api
//                file.getPath();
                String s = file.toString();
                //全部转成小写
                s.toLowerCase();
                //如果是以.java结尾文件
                boolean b = s.endsWith(".jpg");
               //判断如果是
                if(b){
                    System.out.println(s);
                }
            }
        }
    }
}
