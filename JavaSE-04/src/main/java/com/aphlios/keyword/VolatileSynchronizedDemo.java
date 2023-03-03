package com.aphlios.keyword;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/2  8:41
 * @PackageName: com.aphlios.keyword
 * @ClassName: VolatileSynchronizedDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      volatile    synchronized
 *
 */
public class VolatileSynchronizedDemo {

    /**
     *  volatile 关键字
     *      不具备互斥性
     *      不能保证变量的的原子性
     *      java内存模型中的可见性、原子性、有序性。
     *          当多个线程对一个数据进行操作时，可以保证内存中的数据时可见的，但是不确保数据是一定正确的，因为有缓存的存在可能会导致脏读，
     *              相对于 synchronized（同步锁）是一种轻量级的同步策略。
     *
     *  synchronized 关键字
     *      同步
     *
     */
    volatile static List<Integer> list = new ArrayList<>();
    volatile static int count = 0;

    public Thread threadCount(Thread thread){
        return thread;
    }

    public static Boolean size(){
        boolean f = false;

        if (list.size() >= 10){
            f = true;
        }
        return f;
    }

    public static void main(String[] args) {
        VolatileSynchronizedDemo synchronizedDemo = new VolatileSynchronizedDemo();
        //线程一
        Thread t1 = synchronizedDemo.threadCount(new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"开始执行");
                for (int i = 0; i < 20; i++) {
                    list.add(i);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "已经执行完");
        }, "线程一"));

        //线程二
        Thread t2 = synchronizedDemo.threadCount(new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"开始执行");
                while (!size()){
                    System.out.println("List集合中已经有五个元素了");
                }
            System.out.println(Thread.currentThread().getName()+"执行完毕");
        }, "线程二"));

        t1.start(); t2.start();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("main主线程---线程一执行了：" + count);

    }
}
