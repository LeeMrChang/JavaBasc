package com._Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName:TCPServer
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 20:47
 * @Description: TODO
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1、创建TCP服务器端，设置好接受客户端的端口号
        ServerSocket server = new ServerSocket(8888);
        //监听截取
        Socket socket = server.accept();
        //2、根据截取的客户端对象获取TCP读取流
        InputStream is = socket.getInputStream();
        //创建本地存储图片的file文件
        File file = new File("D:\\upload");
        //判断文件是否存在
        if(!file.exists()){
            file.mkdirs();
        }
        //3、创键本地写出流，将读取到的文件写到内存
        FileOutputStream fos = new FileOutputStream(file+"\\a.jpg");
        //TCP读取
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=is.read(bytes))!=-1){
            //本地写出
            fos.write(bytes,0,len);
        }
        //4、根据截取到的客户端对象获取TCP写出流，响应客户端信息
        OutputStream os = socket.getOutputStream();
        //TCP写出响应
        os.write("图片上传成功".getBytes());
        //关闭流
        socket.close();
        server.close();
        fos.close();
    }
}
