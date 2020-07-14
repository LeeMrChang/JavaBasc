package com.lee.single.lazyMan;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LazySingle5Test {
    /**
     * 调用线程安全
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception {
        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };

        /**
         * 创建线程池
         */
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = es.submit(c);
        Future<Singleton5> f2 = es.submit(c);
        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        //关闭线程池
        es.shutdown();
    }
}
