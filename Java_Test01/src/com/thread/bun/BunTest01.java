package com.thread.bun;

/**
 * @ClassName:BunTest01
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 16:12
 * @Description: TODO
 */
public class BunTest01 {
    public static void main(String[] args) {

        /**
         * 包子对象
         */
        Bun bun = new Bun();
//
//        /**
//         * 生产者
//         */
//        Producer producer = new Producer(bun);
//        producer.start();
//
//        /**
//         * 消费者
//         */
//        Consumer consumer = new Consumer(bun);
//        consumer.start();

        new Producer(bun).start();
        new Consumer(bun).start();
    }
}
