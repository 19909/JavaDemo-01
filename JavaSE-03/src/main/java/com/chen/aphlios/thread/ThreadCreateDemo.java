package com.chen.aphlios.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  21:22
 * @PackageName: com.chen.aphlios.thread
 * @ClassName: ThreadDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      创建线程的方式
 */
public class ThreadCreateDemo {

    class CreateThread extends Thread{
        @Override
        public void run() {
            System.out.println("继承Thread类，实现线程");
        }
    }

    class CreateRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("实现Runnable接口，实现线程");
        }
    }

    static class CreateCallable implements Callable{
        @Override
        public Object call() throws Exception {
            return null;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCreateDemo threadDemo = new ThreadCreateDemo();
        Callable<String> createCallable = new CreateCallable();  //创建Callable接口对象
        //将Callable接口对象作为FutureTask类的构造器参数，封装成一个FutureTask，     FutureTask作为线程返回值的包装类。
        FutureTask<String> stringFutureTask = new FutureTask<>(createCallable);
        String s = stringFutureTask.get();  //使用 FutureTask类的 get方法来获取线程执行后的结果。
        new Thread(stringFutureTask).start();   //将FutureTask对象作为Thread对象的target创建新的线程,并启动。

    }
}
