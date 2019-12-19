package com.BufferedIO;

import java.io.*;

/**
 * @ClassName:ReaderTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 14:02
 * @Description: TODO
 */
public class ReaderTest01 implements Serializable {

    public static void main(String[] args) throws IOException {
        //1、字符读取（输入）转换流对象，charsetName表示指定的字符集编码，不指定默认utf-8
        InputStreamReader isr = new InputStreamReader
                (new FileInputStream(
                        "Java_Test01/src/com/BufferedIO/我是GBK.txt"),
                        "GBK");

        int len = 0;
        while ((len = isr.read())!=-1){
            System.out.print((char)len);
        }
        isr.close();
    }
}
