package com.aphlios.entity;

import java.util.concurrent.TimeUnit;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/1  15:46
 * @PackageName: com.aphlios.entity
 * @ClassName: ThreadJoin
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *
 */
public class ThreadJoin {
    /**
     *
     * 线程池的五种状态
     *  创建  创建线程
     *  就绪  线程执行 start()方法  、sleep结束 、 t2.join()终止 、等待用户输入完毕
     *  运行  CUP随机调用
     *  阻塞  可通过sleep()、t2.join()、用户输入
     *  死亡  run()、main()方法结束后
     */

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("----");
        });

        thread.start(); //线程进入就绪状态，等待CUP调度执行
        thread.join();  // 当一个线程调用了join方法，该线程会和main线程组成串行链，表示该线程执行完之后才能继续执行后面的线程。

        Thread.currentThread().setName(""); //设置线程名称
        Thread.currentThread().setPriority(1);  //设置线程的优先级  范围是 1-10    10表示的优先级最大。 （优先级在线程池中应用）
    }
}
