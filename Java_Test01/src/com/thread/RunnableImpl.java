package com.thread;

/**
 * @ClassName:RunnableImpl
 * @Author：Mr.lee
 * @DATE：2019/12/11
 * @TIME： 19:43
 * @Description: TODO
 */
public class RunnableImpl implements Runnable {

    @Override
    public void run() {

        //设置线程任务
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
