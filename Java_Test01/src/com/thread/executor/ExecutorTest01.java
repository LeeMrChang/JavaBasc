package com.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName:Executor
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 16:56
 * @Description: TODO
 */
public class ExecutorTest01 {

    public static void main(String[] args){

        //使用线程池的4个步骤
        //1、创建一个线程池，并设置线程池的数量 Executors
        ExecutorService es = Executors.newFixedThreadPool(2);
        //3、使用submit方法，传入Runnable实现类对象,从线程中多次调用线程
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //4、关闭线程池的方法，一般不使用
        es.shutdown();
    }
}
