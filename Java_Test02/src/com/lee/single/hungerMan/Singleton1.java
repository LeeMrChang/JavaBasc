package com.lee.single.hungerMan;

/**
 * 饿汉式：
 *    在类初始化的时候直接创建实例对象，不管你是否需要这个对象都会创建
 *    不会有线程安全的问题
 *
 *  （1）构造器私有化
 *  （2）自行创建，并且用静态变量保存
 *  （3）向外提供这个实例
 *  （4）强调这是一个单例，我们可以用final修饰
 */
public class Singleton1 {

    /**
     * public 向外提供这个实例，final强调这是一个单例
     */
    public static final Singleton1 INSTANCE = new Singleton1();

    /**
     * 私有化构造器
     */
    private Singleton1(){

    }
}
