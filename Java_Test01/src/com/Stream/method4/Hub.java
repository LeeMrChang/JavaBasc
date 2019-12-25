package com.Stream.method4;

import java.util.stream.Collectors;

/**
 * @ClassName:Hub
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 20:16
 * @Description: TODO
 */
public class Hub {

    public void see(){
        System.out.println("想干嘛就干嘛");
    }

    public void show(rich rich){
       rich.buy();
    }

    public void buyZi(){
        show(()-> this.see());
        show(this::see);
    }

    public static void main(String[] args) {
        new Hub().buyZi();
    }
}
