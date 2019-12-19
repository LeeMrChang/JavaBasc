package com.Stream.method2;

/**
 * @ClassName:MyTest01
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 19:45
 * @Description: TODO
 */
public class MyTest01 {
    //返回值的方法
    public static int Maths(int num,Calculator calculator){
        return calculator.MyMethod(num);
    }

    public static void main(String[] args) {
        int number = Maths(-10,(i)-> Math.abs(i));
        System.out.println(number);
        //方法引用
        int maths = Maths(-10, Math::abs);
        System.out.println(maths);
    }
}
