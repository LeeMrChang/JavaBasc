package com.thread.bun;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName:Producer
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 15:46
 * @Description: TODO
 */
public class Producer extends Thread {

    AtomicInteger i = new AtomicInteger(0);

    /**
     * 创建包子对象
     * 生产者与消费者都需要使用包子对象作为同一个锁对象
     */
    private Bun bun;

    /**
     * 使用带参构造吗，为包子赋值变量
     *
     * @param
     */
    public Producer(Bun bun) {
        this.bun = bun;
    }


    /**
     * 生产者类，做包子
     * 设置做包子的线程任务
     */
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bun) {
                //判断，有包子，进入等待，消费者吃完包子再进行生产包子
                if (bun.status == true) {
                    try {
                        bun.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //没有包子，生产包子
                    if (count % 2 == 0) {
                        bun.skin = "薄皮";
                        bun.filling = "猪肉馅";
                    }else {
                        bun.skin = "葱花皮";
                        bun.filling = "牛肉馅";
                    }
                    count++;
                    System.out.println("正在生产："+bun.skin+bun.filling+"包子");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //此时生产好包子，将包子的状态修改为有包子，并唤醒消费者线程来购买包子
                    this.bun.status = true;
                    bun.notify();
                    System.out.println("已经做好的有："+bun.skin+bun.filling+"包子，可以来购买包子了");
                }
            }
        }
    }
}
