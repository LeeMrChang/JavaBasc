package com.thread.java_model;

/**
 * @ClassName:Kafka
 * @Author：Mr.lee
 * @DATE：2020/05/22
 * @TIME： 21:11
 * @Description: TODO
 */
public class Kafka {

    private volatile  boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Kafka kafka = new Kafka();
        while (kafka.running){
            Thread.sleep(1000);
        }
    }
}
