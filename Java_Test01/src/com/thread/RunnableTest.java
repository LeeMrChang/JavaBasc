package com.thread;

/**
 * @ClassName:RunnableTest
 * @Author：Mr.lee
 * @DATE：2019/12/11
 * @TIME： 19:46
 * @Description: TODO
 */
public class RunnableTest {

    public static void main(String[] args) {
        //创建Runnable实现类对象
        RunnableImpl runnable = new RunnableImpl();

        //创建线程对象，在构造方法中放入Runnable实现类对像
        Thread thread = new Thread(runnable);

        //调用开启线程的方法
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
