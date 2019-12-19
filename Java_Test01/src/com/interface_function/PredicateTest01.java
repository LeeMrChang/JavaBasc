package com.interface_function;

import java.util.function.Predicate;

/**
 * @ClassName:PredicateTest01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 19:58
 * @Description: TODO
 */
public class PredicateTest01 {
    public static boolean method(String str, Predicate<String> predicate){
        //用于判断返回的数据的boolean值
         return predicate.test(str);
    }

    public static void main(String[] args) {
        boolean b= method("asdfg",(str)->str.length()>5);
        System.out.println(b);

    }
}
