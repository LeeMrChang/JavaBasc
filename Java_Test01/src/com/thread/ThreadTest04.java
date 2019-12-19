package com.thread;

/**
 * @ClassName:ThreadTest04
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 14:55
 * @Description: TODO
 */
public class ThreadTest04 {
    /**
     * 线程演示等待与唤醒
     * 告知要买包子，说明包子的数量与种类
     * 然后做包子花5秒
     * 做好包子通知做好包子了，开吃
     *
     * 保证线程的同步与唯一，使用同步锁
     *
     * 通知包子已经做好，唤醒正在等待的线程
     * 吃包子，吃包子需要时间进入等待状态，
     * 吃完包子，唤醒做包子的线程
     */


    public static void main(String[] args) {

        /**
         * 设置同步锁对象
         */
        Object obj = new Object();

        new Thread(){
            /**
             * 创建做顾客消费线程
             */
            @Override
            public void run() {

                while (true){
                    synchronized (obj){
                        System.out.println("通知要做包子的数量与种类：");
                        /**
                         * 线程进入等待状态，就是等待做包子
                         */
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("线程醒了之后，吃包子中。。。");
                        System.out.println("------------------------------------>");
                    }
                }
            }
        }.start();

        new Thread(){
            /**
             * 包子铺做包子线程
             */
            @Override
            public void run() {
                while (true){
                    /**
                     * 做包子，需要时间，线程进入睡眠状态
                     */
                    try {

                        Thread.sleep(2000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("包子做好了，现在吃包子！");
                        /**
                         * 包子做好了，通知顾客消费包子，现在唤醒正在等待的顾客线程
                         */
                        obj.notify();
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }

}
