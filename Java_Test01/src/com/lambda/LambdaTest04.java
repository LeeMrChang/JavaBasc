package com.lambda;

/**
 * @ClassName:LambdaTest04
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 17:49
 * @Description: TODO
 */
public class LambdaTest04 {

    public static void main(String[] args) {

        invokeCalc(12,133,(int a,int b)->{
            return a+b;
        });

        //带参数的省略模式
        invokeCalc(12,133,(a,b)->a+b);



    }

    public static void invokeCalc(int a,int b,Calculator calculator){
        int sum = calculator.sumPrint(a,b);
        System.out.println("统计两个数的总和："+sum);
    }
}
