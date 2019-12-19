package com.thread.lock;

/**
 * @ClassName:BuyMovieTest01
 * @Author：Mr.lee
 * @DATE：2019/12/11
 * @TIME： 20:29
 * @Description: TODO
 */
public class BuyMovieTest01 {

    public static void main(String[] args) {

        Runnable movie = new BuyMovie();

        System.out.println("run"+movie);
        Thread t1 = new Thread(movie);
        Thread t2 = new Thread(movie);
        Thread t3 = new Thread(movie);

        t1.start();
        t2.start();
        t3.start();
    }
}
