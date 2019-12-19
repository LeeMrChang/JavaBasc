package com.lambda;

/**
 * @ClassName:LambdaTest01
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 17:19
 * @Description: TODO
 */
public class LambdaTest01 {

    public static void main(String[] args) {

        //使用你命好内部类创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类创建了一个线程。。。。");
            }
        }).start();

        //使用Lambda表达式创建一个多线程，简化代码
        new Thread(() -> {
            System.out.println("使用Lambda表达式创建了一个线程。。。。");
        }).start();

        //省略模式
        new Thread(()->System.out.println("使用Lambda表达式创建了一个线程。。。。")).start();
    }
}
