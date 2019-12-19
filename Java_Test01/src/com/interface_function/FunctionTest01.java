package com.interface_function;

import java.util.function.Function;

/**
 * @ClassName:FunctionTest01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 20:30
 * @Description: TODO
 */
public class FunctionTest01 {
    public static void change(String str, Function<String,Integer> fun){
        //将一个字符串转换成一个int类型数据
        Integer integer = fun.apply(str);
        System.out.println(integer);
    }

    public static void main(String[] args) {
        change("1234",(str)->Integer.parseInt(str));
    }
}
