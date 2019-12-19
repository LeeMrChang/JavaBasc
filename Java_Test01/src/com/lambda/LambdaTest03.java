package com.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName:LambdaTest03
 * @Author：Mr.lee
 * @DATE：2019/12/13
 * @TIME： 17:38
 * @Description: TODO
 */
public class LambdaTest03 {

    public static void main(String[] args) {

        Person[] arr = {
                new Person("啊旭",18),
                new Person("啊东",19),
                new Person("小伦",20),
                new Person("小值",21),
        };

        //v,i表示参数
        Arrays.sort(arr,(Person v,Person i)->{
            return i.getAge()-v.getAge();
        });

        //省略模式
        Arrays.sort(arr,(v, i)->i.getAge()-v.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
