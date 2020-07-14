package com.test;

public class Test05 {

    //创建一个冒泡排序的静态数组
    static int[] array = {1,2,4,5,0,3};

    public static void main(String[] args) {
        maopaoSort(array);
    }

    //冒泡排序的静态方法
    public static void maopaoSort(int[] a){

        //遍历外层，外层控制排序的遍历次数
        for(int i = 0;i < a.length-1;i++){

            //遍历内层，内层对元素进行两两比较，
            //比较索引1的值 小于 索引2的值 情况下，互换位置
            for(int j = 0;j < a.length-1-i;j++){
                //如果索引【1】> 索引【2+1】
                if(a[j] > a[j+1]){
                    //定义一个变量来互换位置
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("打印遍历的冒泡:");
        for (int i1 = 0; i1 < a.length; i1++) {
            System.out.println(a[i1]+"");
        }
    }
}
