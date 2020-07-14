package com.lee.test;

public class RebTest {

    public static void main(String[] args) {
        /*int a = 1;
        int b = ++a;
        System.out.println(b);
        int d = 1;
        int c = d++;
        System.out.println(c);*/
        int i = 1;
        i = i++;
        System.out.println("1："+i);
        int j = i++;
        System.out.println("2:"+i);
        //2+ 3 * 3
        int k = i+ ++i * i++;
        System.out.println(i);
//        System.out.println(j);
        System.out.println(k);
    }
}
