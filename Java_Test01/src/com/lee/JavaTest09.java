package com.lee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName:JavaTest09
 * @Author：Mr.lee
 * @DATE：2019/12/09
 * @TIME： 20:09
 * @Description: TODO
 */
public class JavaTest09 {
    public static void main(String[] args) {

        /**
         * 统计每次随机输入的字符串的字符个数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String anInt = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : anInt.toCharArray()) {
            //key存在
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                //key不存在,每次添加1
                map.put(c,1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
