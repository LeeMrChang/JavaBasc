package com.interface_function;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @ClassName:PredicateTest04
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 20:15
 * @Description: TODO
 */
public class PredicateTest04 {
    public static ArrayList<String> method(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        //and();表示必须满足两个条件才是true  &&并且
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        /**
         * 输出性别为女，名称长度要4个字符
         */
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马儿扎哈,男", "赵丽颖,女"};
        ArrayList<String> list = method(arr, (str) -> str.split(",")[1].equals("女"),
                (str) -> str.split(",")[0].length() == 4);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
