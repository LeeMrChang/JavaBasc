package com.thread;

/**
 * @ClassName:ThreadTest02
 * @Author：Mr.lee
 * @DATE：2019/12/10
 * @TIME： 21:12
 * @Description: TODO
 */
public class ThreadTest02 {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        /**
         * 获取此线程的名称
         */
        String name = thread.getName();

        //获取当前线程,currentThread();是一个静态获取当前线程的方法
        Thread thread1 = Thread.currentThread();
        String name1 = thread1.getName();
        System.out.println(name1);

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * 线程开启运行
         */
        thread.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println("main方法运行"+i+name);
        }
    }
}
