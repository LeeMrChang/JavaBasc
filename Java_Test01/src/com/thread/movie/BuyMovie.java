package com.thread.movie;

/**
 * @ClassName:BuyMovie
 * @Author：Mr.lee
 * @DATE：2019/12/11
 * @TIME： 20:26
 * @Description: TODO
 */
public class BuyMovie implements Runnable{


    private int ticket = 100;

    //锁对象
    Object obj = new Object();

    @Override
    public void run() {
        System.out.println("this"+this);
        while (true) {
            payTicket();
//            synchronized (obj){
//                if(ticket>0){
//
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
//                    ticket--;
//                }
//            }
        }
    }

    public synchronized void payTicket(){
        if(ticket>0){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
