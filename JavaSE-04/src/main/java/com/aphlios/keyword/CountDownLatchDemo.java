package com.aphlios.keyword;

import java.util.concurrent.CountDownLatch;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/2  19:23
 * @PackageName: com.aphlios.keyword
 * @ClassName: CountDownLatchDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      CountDownLatch 类是一个关于线程
 */
public class CountDownLatchDemo {

    /**
     * CountDownLatch类的概念
     *      CountDownLatch是一种同步工具，用于协调多个线程之间的同步，或者说线程之间的通信
     *          CountDownLatch能够使一个线程在等待另外一些线程完成各自工作之后，再继续执行。使用一个计数器实现，计数器初始值为线程的数量。
     *          当每个线程完成自己的任务后，计数器的值就会减一。当计数器的值为0时，表示所有的线程都已经完成各自的任务，此时，在CountDownLatch类上
     *          等待的线程才可以恢复，继续执行接下来的任务。
     *
     * CountDownLatch类的用法
     *      1、某个线程在开始运行前等待n个线程执行完毕，将CountDownLatch的计数器初始化为 new CountDownLatch(n)，每个线程执行完，将计数器减一
     *          当计数器上面的值变成0时，此时在CountDownLatch上停留的线程才能继续往下执行。
     *      2、线程执行完调用countDown()方法，表示调用该方法的线程执行完毕，如果其他线程调用了await()方法，在此时调用await()方法的线程开始执行。
     *
     */

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

            }
            System.out.println(Thread.currentThread().getName() + "执行完了");
            latch.countDown();  //这段代码表示thread线程运行完毕
        },"A");

        Thread b = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

            }
            System.out.println(Thread.currentThread().getName() + "执行完了");
            latch.countDown();  //这段代码表示thread线程运行完毕
        }, "B");

        thread.start();
        b.start();
        System.out.println(Thread.currentThread().getName() + "执行完了");
        //执行了
        try {
            latch.await();  //使用了latch对象的线程，全部执行完开始执行，这段代码后面的内容（不包括main线程。）
            System.out.println("await方法后面的内容");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}