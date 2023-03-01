package com.chen.aphlios.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  19:00
 * @PackageName: com.chen.aphlios.thread
 * @ClassName: ChatServerDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      服务端
 */
public class ChatServerDemo {

    public static void main(String[] args) throws IOException {
        int PORT = 8029;
        String SERVER_IP = "192.168.14.43";
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("服务器已经准备好~~~");
        Socket accept = serverSocket.accept();
        System.out.println("有人连接了");
        new Thread(new ThreadClientSockedDemo(accept,"服务器"),"t1").start();
        new Thread(new ThreadServerSockedDemo(accept,"李四"),"t2").start();
    }
}
