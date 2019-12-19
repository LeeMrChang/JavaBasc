package com._Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName:SocketTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 19:44
 * @Description: TODO
 */
public class SocketTest01 {

    public static void main(String[] args) throws IOException {
        //1、创建TCP通信的Socket类客户端类，利用构造绑定IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8089);
        //2、使用socket类获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //3、向服务器发送数据
        outputStream.write("你好服务器".getBytes());
        //4、获取读取流
        InputStream inputStream = socket.getInputStream();
        byte[] arr = new byte[1024];
        int len = 0;
        while ((len=inputStream.read(arr))!=-1){
            //打印获取到的信息
            System.out.println(new String(arr,0,len));
        }

        //关闭流
        socket.close();
    }
}
