package com.interface_function;

/**
 * @ClassName:LambdaYest01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 11:49
 * @Description: TODO
 */
public class LambdaYest01 {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        //Lambda表达式
        new Thread(()->
            System.out.println(Thread.currentThread().getName())
        ).start();
    }
}
