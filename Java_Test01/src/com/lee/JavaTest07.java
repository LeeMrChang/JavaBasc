package com.lee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName:JavaTest07
 * @Author：Mr.lee
 * @DATE：2019/12/09
 * @TIME： 18:40
 * @Description: TODO
 */
public class JavaTest07 {
    public static void main(String[] args) {

        List<String> list =  new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        int i = add(10,20,20,30);
        System.out.println(i);
    }

    private static int add(int...arr) {

        int num = 0;
        for (int i : arr) {
            num+=i;
        }
        return num;
    }
}
