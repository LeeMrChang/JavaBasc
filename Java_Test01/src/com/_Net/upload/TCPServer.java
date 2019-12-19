package com._Net.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

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
        while (true) {
            //监听截取
            Socket socket = server.accept();
            //使用多线程实现多个用户上传
            new Thread(()-> {
                    try {
                        //2、根据截取的客户端对象获取TCP读取流
                        InputStream is = socket.getInputStream();
                        //创建本地存储图片的file文件
                        File file = new File("D:\\upload");
                        //判断文件是否存在
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        //防止文件名重复
                        String fileName = "lee" + System.currentTimeMillis() + new Random().nextInt(8888) + ".jpg";
                        //3、创键本地写出流，将读取到的文件写到内存
                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                        //TCP读取
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            //本地写出
                            fos.write(bytes, 0, len);
                        }
                        //4、根据截取到的客户端对象获取TCP写出流，响应客户端信息
                        OutputStream os = socket.getOutputStream();
                        //TCP写出响应
                        os.write("图片上传成功".getBytes());
                        //关闭流
                        socket.close();
                        fos.close();
                    }catch (IOException e){
                        System.out.println(e);

                }
            }).start();
        }
    }
}
