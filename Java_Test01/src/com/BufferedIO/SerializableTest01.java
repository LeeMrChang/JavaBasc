package com.BufferedIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

/**
 * @ClassName:SerializableTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 14:49
 * @Description: TODO
 */
public class SerializableTest01 {
    public static void main(String[] args) throws IOException {
        //创建序列化流对象，就是将对象写入文件或者内存中
        ObjectOutputStream osw = new ObjectOutputStream
                (new FileOutputStream(
                        "Java_Test01/src/com/BufferedIO/K.txt"));
        //写出
        osw.writeObject(new Person("费菜菜",18));
        osw.close();
    }
}
