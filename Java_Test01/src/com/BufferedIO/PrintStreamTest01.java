package com.BufferedIO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ClassName:PrintStreamTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 15:34
 * @Description: TODO
 */
public class PrintStreamTest01 {

    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流对象，它的构造方法可以绑定输出的目的地
        PrintStream stream = new PrintStream(
                "Java_Test01/src/com/BufferedIO/F.txt");
        //要打印的数据，可以是任意类型
        stream.println(1);
        stream.println("helloWord");
        stream.println('b');
        stream.println(new Person("传奇",18));
        //关闭流
        stream.close();
        //指定了打印的目的地，打印的内容都在F.txt文件中
    }
}
