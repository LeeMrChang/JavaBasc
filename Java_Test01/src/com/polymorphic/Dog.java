package com.polymorphic;

/**
 * @ClassName:Dog
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 14:30
 * @Description: TODO
 */
public class Dog extends Animal {


    @Override
    void eat() {
        System.out.println("吃骨头");
    }

    public void watchHouse(){
        System.out.println("看家");
    }
}
