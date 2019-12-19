package com.interface_function;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName:LambdaYest02
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 11:51
 * @Description: TODO
 */
public class LambdaYest02 {

    public static Comparator<String> show(){
        //匿名内部类
       /* return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };*/
        //Lambda表达式
       /* return (String o1, String o2)->{
            return o1.length()-o2.length();
        };*/
        //Lambda表达式单输出与return的最简便式：
        return (o1,o2)->o1.length()-o2.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aa","ddd","bbb","ccc"};
        Arrays.sort(arr,show());
        System.out.println(Arrays.toString(arr));
    }
}
