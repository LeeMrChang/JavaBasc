package com.thread;

/**
 * @ClassName:MyThread
 * @Author：Mr.lee
 * @DATE：2019/12/10
 * @TIME： 21:11
 * @Description: TODO
 */
public class MyThread extends Thread {
    /**
     * 重写线程类的run方法，相当于开启？线程
     */
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("线程启动了"+i);
        }
    }
}
