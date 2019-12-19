package com.thread;

/**
 * @ClassName:ThreadTest03
 * @Author：Mr.lee
 * @DATE：2019/12/11
 * @TIME： 20:06
 * @Description: TODO
 */
public class ThreadTest03 {
    public static void main(String[] args) {

        //使用Thread对象的匿名内部类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();
        //使用实现Runnable接口的匿名内部类
        Runnable r= new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
