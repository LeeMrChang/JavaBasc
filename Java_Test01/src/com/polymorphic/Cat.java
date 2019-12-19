package com.polymorphic;

/**
 * @ClassName:Cat
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 14:28
 * @Description: TODO
 */
public class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
