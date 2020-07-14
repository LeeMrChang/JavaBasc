package com.lee.landlord;

import java.util.*;

public class Landlord {

    public static void main(String[] args) {
        //斗地主分牌案例
        //1、创建map装牌  使用list集合 封装拼接 花色与 1数字的牌
        Map<Integer,String> poker = new HashMap<>();
        List<String> colours = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        colours.add("♠");
        colours.add("♥");
        colours.add("♣");
        colours.add("♦");
        Collections.addAll(numbers,
                "3","4","5","6","7","8","9","10","J","Q","K","A","2");

        int index = 0;

        for (String colour : colours) {
            for (String number : numbers) {
                poker.put(index++,colour+number);
            }
        }

        poker.put(index++,"☺");
        poker.put(index++,"☹");


        // 54 张牌的索引
        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i <= 53; i++) {
            cards.add(i);
        }

        Collections.shuffle(cards);

        //2、发牌，创建容器封装牌
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        List<Integer> D = new ArrayList<>();



        for (int i = 0; i < cards.size(); i++) {
            if(i>=51){
                D.add(cards.get(i));
            }else if(i%3==0){
                A.add(cards.get(i));
            }else if(i%3==1){
                B.add(cards.get(i));
            }else if(i%3==2){
                C.add(cards.get(i));
            }

        }

        Collections.sort(A);
        Collections.sort(B);
        Collections.sort(C);
        Collections.sort(D);


        //3、看牌
        lookPoker("地主：",poker,A);
        lookPoker("农民1：",poker,B);
        lookPoker("农民2：",poker,C);
        lookPoker("底牌：",poker,D);
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
