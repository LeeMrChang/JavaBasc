package com._Net.upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName:TCPClient
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 20:39
 * @Description: TODO
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1、创建本地读取流
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\下马86\\Desktop\\练习文件夹\\a.jpg");
        //2、创建TCP通信的客户端类
        Socket socket = new Socket("127.0.0.1",8888);
        //3、socket获取写出流，请求服务器端
        OutputStream os = socket.getOutputStream();
        //读取
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
           //TCP网络写出
            os.write(bytes,0,len);
        }
        //4、socket获取读取流，打印响应信息
        InputStream is = socket.getInputStream();
        byte[] arr = new byte[1024];
        int lens = 0;
        while ((lens=is.read(arr))!=-1){
            //打印响应的信息
            System.out.println(new String(arr,0,lens));
        }
        //5、关闭流
        fis.close();
        socket.close();
    }
}
