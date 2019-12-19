package com.thread.executor;

/**
 * @ClassName:RunnableImpl
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 17:05
 * @Description: TODO
 */
public class RunnableImpl implements Runnable {
    /**
     * 使用线程池的步骤
     * 2、创建一个Runnable的实现类，并设置线程任务
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个线程...");
    }
}
