package com.Stream;

import java.util.stream.Stream;

/**
 * @ClassName:StreamFilter
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 16:44
 * @Description: TODO
 */
public class StreamFilter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "周芷若", "赵敏", "张强", "张三丰");
        //过滤姓“张”的数据且名字长度为3个字符的
        Stream<String> stream1 = stream.filter(name -> name.startsWith("张"))
                                    .filter(name->name.length()==3);
        stream1.forEach((name)-> System.out.println(name));
        stream.forEach((name)-> System.out.println(name));
    }
}
