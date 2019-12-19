package com.Stream;

import javax.naming.Name;
import java.util.stream.Stream;

/**
 * @ClassName:StreamForEach
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 16:36
 * @Description: TODO
 */
public class StreamForEach {

    public static void main(String[] args) {
        //Stream流添加多个数据
        Stream<String> stream = Stream.of(
                "刘塘", "吴用", "阮小二", "阮小五", "杨志", "阮小七", "公孙胜");
        //遍历流的方式
        stream.forEach(name-> System.out.println(name));

    }
}
