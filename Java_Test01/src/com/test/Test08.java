package com.test;

public class Test08 {

    public static void main(String[] args) {
        int i = 5;
        int n = 25 - (i++) + (--i);
        System.out.println(n);

        int j = 0;
        for (int i1 = 0; i1 < 10; i1++) {
            if( i1 % 3 == 1){
                j += i1;
            }
        }
        System.out.println(j);

        int g = 16 - (16>>3);
        System.out.println(g);

        int a = 0;
        int b = 5;
        int k = 20 * (a / b) -20;
        System.out.println(k);

    }
}
