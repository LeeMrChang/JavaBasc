package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName:StreamTest01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 20:57
 * @Description: TODO
 */
public class StreamTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        //对数据进行过滤：1、已张开头。2、长度只有3的条件
       list.stream()
               .filter(name -> name.startsWith("张"))
               .filter(name -> name.length() == 3)
               .forEach(name-> System.out.println(name));

    }
}
