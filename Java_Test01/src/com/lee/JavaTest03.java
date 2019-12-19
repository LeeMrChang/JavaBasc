package com.lee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:JavaTest03
 * @Author：Mr.lee
 * @DATE：2019/12/01
 * @TIME： 13:22
 * @Description: TODO
 */
public class JavaTest03 {

    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();

        arr.add("a");
        arr.add("b");
        arr.add("c");

        System.out.println(arr.get(2));
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr);

        Map<String,Object> map = new HashMap<>();

        map.put("1","传奇");
        map.put("2","xingxin");
        map.put("3","小红");

        System.out.println(map);

    }
}
