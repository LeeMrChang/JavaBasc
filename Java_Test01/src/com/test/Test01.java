package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:Test01
 * @Author：Mr.lee
 * @DATE：2020/05/12
 * @TIME： 15:54
 * @Description: TODO
 */
public class Test01 {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        int code = s1.hashCode();

        int i = 123;

        Map map  = new HashMap();

        System.out.println("hash值："+code);

        System.out.println(s1==s2);

        String s3 = new String("abc");

        System.out.println(s1==s3);

        System.out.println(s1==s3.intern());


    }
}
