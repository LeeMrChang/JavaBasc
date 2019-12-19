package com.recursive;

/**
 * @ClassName:RecursiveTest01
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 10:21
 * @Description: TODO
 */
public class RecursiveTest01 {

    public static void main(String[] args) {
        show01(1000);
    }

    private static void show01(int i) {
        //这种递归方式会造成内存溢出
        System.out.println(i);
        show01(++i);
    }
}
