package com.lambda;

/**
 * @ClassName:LambdaTest02
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 17:34
 * @Description: TODO
 */
public class LambdaTest02 {
    public static void main(String[] args) {

        invokeCook(() -> {
            System.out.println("吃饭了");
        });
        invokeCook(() -> System.out.println("吃饭了"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
