package com.polymorphic;

/**
 * @ClassName:DogTest
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 14:34
 * @Description: TODO
 */
public class DogTest {

    public static void main(String[] args) {

        /**
         * 向上转型
         */
        Animal a = new Cat();
        a.eat();

        /**
         * 向下转型
         */
        if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }else if(a instanceof Dog){
            Dog d = (Dog) a;
            d.watchHouse();
        }
    }
}
