package com.aphlios.keyword;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/2  19:54
 * @PackageName: com.aphlios.keyword
 * @ClassName: ReentrantLockDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class ReentrantLockDemo {

    /**
     * new ReentrantLock();
     * 参数位置
     *      加上true 是公平锁，不加 true 是非公平锁。
     *
     *  特性:
     *      可打断性：
     *          想要实现可打断特性，不可以调用lock()方法，需要调用lockInterruptibly方法
     *          当有线程竞争锁的时候，某个线程获取锁失败会进入休眠，如果加锁时调用的是lock.lockInterruptibly()
     *          在其他线程中调用 interrupt方法，该线程会报一个异常，放弃争抢锁，如果加锁时调用lock()方法，interrupt 依然会进入休眠状态，直接获取锁。
     *      获取锁超时：
     *          tryLock()，带参数的可以传入一个等待时间，例如lock.tryLock(1, TimeUnit.SECONDS)，如果获取锁失败在1秒内会重试再次获取锁，获取成功返回true，失败返回false。
     *      可重入:
     *          例如：
     *              获取锁1
     *                  获取锁2
     *                      获取锁3
     *                      释放锁3
     *                  释放锁2
     *              释放锁1
     */

    //ReentrantLock 的可重入
    private static final ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args){
        // 获取锁
        lock.lock();
        try {
            System.out.println("main方法中获取到了锁..");
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            lock.unlock();
            System.out.println("main方法中释放到了锁..");
        }
    }
    public static void m1(){
        lock.lock();
        try {
            System.out.println("m1方法中获取到了锁..");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            lock.unlock();
            System.out.println("m1方法中释放了锁..");
        }
    }
}
