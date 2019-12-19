package com.lee;


import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:JavaTest06
 * @Author：Mr.lee
 * @DATE：2019/12/09
 * @TIME： 17:01
 * @Description: TODO
 */
public class JavaTest06 {

    public static void main(String[] args) {

        Set<String> list = new HashSet<>();

        Person person = new Person();
        int code = person.hashCode();
        System.out.println(code);

        String s1 = new String("刘德华");
        String s2 = new String("刘德华");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
