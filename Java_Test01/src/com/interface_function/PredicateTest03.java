package com.interface_function;

import java.util.function.Predicate;

/**
 * @ClassName:PredicateTest03
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 20:13
 * @Description: TODO
 */
public class PredicateTest03 {
    public static boolean method(String str, Predicate<String> pre1, Predicate<String> pre2) {
        //and();表示必须满足两个条件才是true  &&并且
        return pre1.or(pre2).test(str);
    }

    public static void main(String[] args) {
        boolean b = method("dfghjk",
                (str) -> str.length() > 5,
                (str) ->str.contains("a") );
        System.out.println(b);
    }
}
