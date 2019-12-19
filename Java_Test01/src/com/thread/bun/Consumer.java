package com.thread.bun;

/**
 * @ClassName:Consumer
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 16:06
 * @Description: TODO
 */
public class Consumer extends Thread {


    /**
     * 创建包子对象，与带参构造
     */
    private Bun bun;

    public Consumer(Bun bun) {
        this.bun = bun;
    }

    /**
     * 消费者类
     * 设置消费的线程任务
     */
    @Override
    public void run() {
        while (true) {
            synchronized (bun) {
                //判断是否有包子,没有包子,消费进入等待状态，等待生产者生产包子
                if (!bun.status) {
                    try {
                        bun.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //如果有包子，开始吃包子，吃完包子，将包子状态设置为没有包子，通知生产者做包子
                    System.out.println("顾客正在吃"+bun.skin+bun.filling+"的包子");
                    this.bun.status = false;
                    this.bun.notify();
                    System.out.println("已经将"+bun.skin+bun.filling+"的包子吃完，需要再生产包子！");
                    System.out.println("-------------------------------------------------------->");
                }
            }
        }
    }
}
