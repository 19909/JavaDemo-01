package com.chen.aphlios.thread;

import java.io.IOException;
import java.net.Socket;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  19:00
 * @PackageName: com.chen.aphlios.thread
 * @ClassName: ChatClientDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      客户端
 */
public class ChatClientDemo {

    public static void main(String[] args) throws IOException {

        int PORT = 8029;
        String SERVER_IP = "192.168.14.43";
        Socket accept = new Socket(SERVER_IP,PORT);
        new Thread(new ThreadClientSockedDemo(accept,"服务器"),"t1").start();
        new Thread(new ThreadServerSockedDemo(accept,"李四"),"t2").start();
    }
}
