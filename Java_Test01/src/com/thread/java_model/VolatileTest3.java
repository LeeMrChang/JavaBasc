package com.thread.java_model;

/**
 * @ClassName:VolatileTest3
 * @Author：Mr.lee
 * @DATE：2020/05/22
 * @TIME： 21:07
 * @Description: TODO
 */
public class VolatileTest3 {

    static class Work {

       volatile boolean isShutDown = false;

        void shutdown() {
            isShutDown = true;
            System.out.println("shutdown!");
        }

        void doWork() {
            while (!isShutDown) {
                System.out.println("doWork");
            }
        }
    }

    public static void main(String[] args) {
        Work work = new Work();

        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::shutdown).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
    }
}
