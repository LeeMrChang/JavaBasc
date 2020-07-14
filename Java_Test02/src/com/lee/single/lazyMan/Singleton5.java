package com.lee.single.lazyMan;

/**
 * 懒汉式：
 *    延迟创建这个实例对象
 *
 * （1）构造器私有化
 * （2）用一个静态变量保存这个唯一的实例
 * （3）提供一个静态方法，获取这个实例对象
 *  使用synchronized 关键字解决线程安全问题
 */
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5(){

    }

    /**
     * 需要此对象时才创建对象，但是有 出现线程不安全的风险
     * @return
     */
    public static Singleton5 getInstance(){
        /**
         * 使用 synchronized 关键字解决线程安全问题
         */
        synchronized (Singleton5.class){
            if(instance == null){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
