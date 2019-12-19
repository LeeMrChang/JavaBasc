package com.recursive;

/**
 * @ClassName:RecursiveTest02
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 10:30
 * @Description: TODO
 */
public class RecursiveTest02 {

    public static void main(String[] args) {
        int method = method(5);
        System.out.println(method);
    }

    /**
     * 递归计算求和
     */
    public static int method(int n){
        //停止递归，不然会内存溢出
        if(n == 1){
            return 1;
        }
        //n加n的下一个数
        return n * method(n-1);
    }
}
