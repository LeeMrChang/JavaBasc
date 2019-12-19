package com.recursive;

import java.io.File;

/**
 * @ClassName:RecursiveTest03
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 10:47
 * @Description: TODO
 */
public class RecursiveTest05 {
    /**
     * 递归遍历打印多级文件夹与文件
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\下马86\\Desktop\\练习文件夹");
        getAllFiles(file);
    }
    public static void getAllFiles(File dir){

        //传递过滤对象
        File[] files = dir.listFiles(new FileFilterImpl());
        //获取多级文件夹遍历
        for (File file : files) {
            //判断是否是文件夹
            if(file.isDirectory()){
                getAllFiles(file);
            }else {
                //不是文件夹，那就是文件,文件直接打印
                System.out.println(file);
            }
        }
    }
}
