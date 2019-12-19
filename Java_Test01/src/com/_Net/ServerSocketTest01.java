package com._Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName:ServerSocketTest01
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 19:58
 * @Description: TODO
 */
public class ServerSocketTest01 {
    public static void main(String[] args) throws IOException {
        //1、创建TCP通信的服务器端对象,绑定要接收的客户端的端口
        ServerSocket serverSocket = new ServerSocket(8089);
        //获取监听，是否有客户端发送请求过来，有截取此TCP通信的客户端
        Socket socket = serverSocket.accept();
        //2、根据客户端对象获取读取流，并读取其中信息
        InputStream inputStream = socket.getInputStream();
        byte[] arr = new byte[1024];
        int len = 0;
        while ((len=inputStream.read(arr))!=-1){
            //打印获取到的信息
            System.out.println(new String(arr,0,len));
        }
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //写出响应的信息
        outputStream.write("收到谢谢！".getBytes());
        //关闭流
        socket.close();
        serverSocket.close();
    }
}
