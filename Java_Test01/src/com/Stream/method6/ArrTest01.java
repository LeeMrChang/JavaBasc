package com.Stream.method6;

/**
 * @ClassName:ArrTest01
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 20:37
 * @Description: TODO
 */
public class ArrTest01 {
    public static int[] arrTest(int num,Arr arr){
        return arr.arr(num);
    }

    public static void main(String[] args) {
        int[] ints = arrTest(12, (len) -> new int[len]);
        System.out.println(ints.length);
        //方法引用
        int[] ints1 = arrTest(14, int[]::new);
        System.out.println(ints1.length);
    }
}
