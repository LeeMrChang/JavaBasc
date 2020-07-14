package com.lee.single.lazyMan;

import java.util.concurrent.*;

public class LazySingleTest {
    public static void main(String[] args) throws Exception {
        /*Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);*/
        /**
         * 进行多线程测试，出现线程不安全
         */
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };

        /**
         * 创建线程池
         */
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);
        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        //关闭线程池
        es.shutdown();

    }
}
