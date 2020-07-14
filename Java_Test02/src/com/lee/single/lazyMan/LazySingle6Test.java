package com.lee.single.lazyMan;

public class LazySingle6Test {
    public static void main(String[] args) {
        Singleton6 s1 = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
