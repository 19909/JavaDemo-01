package com.chen.aphlios.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  19:49
 * @PackageName: com.chen.aphlios.thread
 * @ClassName: ThreadServerSockedDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      收消息
 */
public class ThreadServerSockedDemo implements Runnable{

    private Socket accept;
    private String name;

    public ThreadServerSockedDemo(Socket accept, String name) {
        this.accept = accept;
        this.name = name;
    }
    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.accept.getInputStream()));
            while (true){
                System.out.println(this.name + " : " + bufferedReader.readLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
