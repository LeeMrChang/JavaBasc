package com.interface_function;

import java.util.function.Function;

/**
 * @ClassName:FunctionTest02
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 20:37
 * @Description: TODO
 */
public class FunctionTest02 {
    public static int change(String str, Function<String,String> fun1, Function<String,Integer> fun2,
                              Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }

    public static void main(String[] args) {
       int num = change("赵丽颖,20",
               (str)->str.split(",")[1],
               (str)->Integer.parseInt(str),
               (i)->i+100);
        System.out.println(num);
    }
}
