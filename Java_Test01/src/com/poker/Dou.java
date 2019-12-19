package com.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName:Dou
 * @Author：Mr.lee
 * @DATE：2019/12/07
 * @TIME： 17:10
 * @Description: TODO
 */
public class Dou {

    public static void main(String[] args) {
        //1、准备牌
        List<String> porker = new ArrayList<>();
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] colour = {"♠","♥","♣","♦"};
        porker.add("🃏");
        porker.add("🃏");
        for (String number : numbers) {
            for (String col : colour) {
                String numList = number + col;
                porker.add(numList);
            }
        }

        //2、洗牌
        Collections.shuffle(porker);

        //3、发牌
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();
        List<String> C = new ArrayList<>();
        List<String> D = new ArrayList<>();

        for (int i = 0; i < porker.size(); i++) {

            String s = porker.get(i);
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

        //4、看牌
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        List<String> stringList = new LinkedList<>();
    }
}
