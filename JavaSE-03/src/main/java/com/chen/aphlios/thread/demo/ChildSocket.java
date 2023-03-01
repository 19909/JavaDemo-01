package com.chen.aphlios.thread.demo;

import java.net.Socket;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/1  9:56
 * @PackageName: com.chen.aphlios.thread.demo
 * @ClassName: ChildSocket
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *
 */
public class ChildSocket implements Runnable {
    //收消息

    private Socket socket;
    private String name;

    public ChildSocket(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        try {


        } catch (Exception e){

        }
    }



}
