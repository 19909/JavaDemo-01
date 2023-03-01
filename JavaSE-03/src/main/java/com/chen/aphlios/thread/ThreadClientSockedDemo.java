package com.chen.aphlios.thread;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  19:49
 * @PackageName: com.chen.aphlios.thread
 * @ClassName: ThreadClientSockedDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      发消息
 */
public class ThreadClientSockedDemo implements Runnable{

    private Socket socket;
    private String name;

    ThreadClientSockedDemo(Socket socket,String name){
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            PrintWriter writer = new PrintWriter(this.socket.getOutputStream());
            while (true){
                writer.write((new Scanner(System.in)).nextLine()+"\r\n");
                writer.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
