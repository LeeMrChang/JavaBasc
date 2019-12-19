package com.BufferedIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName:OutputStreamWriterTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 14:23
 * @Description: TODO
 */
public class OutputStreamWriterTest01 {
    public static void main(String[] args) throws IOException {
        //1、创建字符转换流对象，  charsetName:指定字符编码，不指定默认utf-8
        OutputStreamWriter osw = new OutputStreamWriter
                (new FileOutputStream(
                        "Java_Test01/src/com/BufferedIO/c.txt"),
                        "GBK");
        osw.write("你好");
        osw.close();
    }
}
