package com.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName:BuyMovie
 * @Author：Mr.lee
 * @DATE：2019/12/11
 * @TIME： 20:26
 * @Description: TODO
 */
public class BuyMovie implements Runnable {
    private int ticket = 100;
    /**
     * Lock锁对象
     */
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                //开启锁对象
                lock.lock();
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //加上finally，无论上面代码是否异常，都要是否锁对象，不会造成线程阻塞
                    lock.unlock();
                }
            }
        }
    }
}
