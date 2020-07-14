package com.lee.single.hungerMan;

public class SingleTest {
    public static void main(String[] args) {

        Singleton1 instance1 = Singleton1.INSTANCE;
        System.out.println(instance1);

        Singleton2 instance2 = Singleton2.INSTANCE;
        System.out.println(instance2);

        Singleton3 instance3 = Singleton3.INSTANCE;
        System.out.println(instance3);
    }
}
