package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName:IOExceptionTest01
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 15:14
 * @Description: TODO
 */
public class IOExceptionTest01 {

    public static void main(String[] args) {
        //因作用域问题，需定义在作用域最外面
        FileWriter fw = null;
        try {
            fw = new FileWriter(
                    "W:\\IdeaProjects\\JavaBasic\\" +
                            "Java_Test01\\src\\com\\io\\d.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("你好！"+i+"\r\n");
            }
        } catch (IOException e) {
            //输出捕捉到的异常
            System.out.println(e);
        }finally {
            //结束时fw.close();需要单独处理异常，但前提fw不能为null
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
