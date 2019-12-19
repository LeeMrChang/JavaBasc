package com.poker;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

/**
 * @ClassName:SortDou
 * @Author：Mr.lee
 * @DATE：2019/12/09
 * @TIME： 20:55
 * @Description: TODO
 */
public class SortDou {

    public static void main(String[] args) {

        //1、准备牌，花色
        List<String> colors = new ArrayList<>();
        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");
        //牌基数
        List<String> numbers = new ArrayList<>();
        numbers.add("2");
        numbers.add("A");
        numbers.add("K");
        numbers.add("Q");
        numbers.add("J");
        numbers.add("10");
        numbers.add("9");
        numbers.add("8");
        numbers.add("7");
        numbers.add("6");
        numbers.add("5");
        numbers.add("4");
        numbers.add("3");

        //装牌
        Map<Integer, String> map = new HashMap();

        //创建一个集合来封装牌的索引
        List<Integer> list = new ArrayList<>();

        //定义一个变量作为牌的索引使用,每次添加元素后索引自增
        int index = 1;
        //初始先添加大小王
        map.put(index, "🃏");
        index++;
        map.put(index, "🃏");
        index++;

        for (String number : numbers) {
            for (String color : colors) {
                map.put(index, number + color);
                list.add(index);
                index++;
            }
        }

        //2、洗牌
        Collections.shuffle(list);


        //3、发牌
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        List<Integer> D = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            //获取牌
            Integer s = list.get(i);
            if(i>=51){
                D.add(s);
            }else if(i%3==0){
                A.add(s);
            }else if(i%3==1){
                B.add(s);
            }else if(i%3==2){
                C.add(s);
            }
        }

        //4、排序看牌
        Collections.sort(A);
        Collections.sort(B);
        Collections.sort(C);
        Collections.sort(D);

        //5、看牌
        lookPoker("刘德华",map,A);
        lookPoker("周润发",map,B);
        lookPoker("周星驰",map,C);
        lookPoker("D",map,D);

    }

    private static void lookPoker(String name, Map<Integer, String> map, List<Integer> list) {
        //输出玩家姓名，不换行
        System.out.print(name+":");
        //遍历牌索引集合获取key，根据key获取map的value
        for (Integer key : list) {
            String value = map.get(key);
            //输入拼接的牌
            System.out.print(value+" ");
        }
        //每次换行
        System.out.println();
    }


}
