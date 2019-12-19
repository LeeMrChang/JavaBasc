package com.polymorphic;

/**
 * @ClassName:PolyTest
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 14:31
 * @Description: TODO
 */
public class PolyTest {

    public static void main(String[] args) {

        /**
         * 向上转型
         */
        Animal animal = new Cat();
        animal.eat();


        /**
         * 向下转型
         */
        Cat c = (Cat) animal;
        c.catchMouse();
    }
}
