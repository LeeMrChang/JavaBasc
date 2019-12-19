package com.thread;

/**
 * @ClassName:ThreadTest01
 * @Author：Mr.lee
 * @DATE：2019/12/10
 * @TIME： 21:03
 * @Description: TODO
 */
public class ThreadTest01 {

    public static void main(String[] args) {

        Person p1 = new Person("小强");

        p1.run();

        System.out.println();

        Person p2 = new Person("小熊");

        p2.run();


    }
}
