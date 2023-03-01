package com.aphlios.entity;

import java.util.concurrent.*;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/1  20:36
 * @PackageName: com.aphlios.entity
 * @ClassName: ThreadPoolDmp
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,  //核心线程数
                2,  //最大线程数
                0L,     //线程空闲超时时间
                TimeUnit.SECONDS,       //超时时间单位    （时/分/秒）
                new LinkedBlockingDeque<>(2),   //任务队列  （Runnable）
                //AbortPolicy   DiscardPolicy   DiscardOldestPolicy     CallerRunsPolicy        四种拒绝策略
                new ThreadPoolExecutor.CallerRunsPolicy());     //局决策略
        /**
         *  这四种拒绝策略是ThreadPoolExecutor类中的内部类
         *  AbortPolicy：当任务添加到线程池中被拒绝时，直接丢弃任务，并抛出RejectedExecutionException异常.
         *  DiscardPolicy：当任务添加到线程池中被拒绝时，丢弃被拒绝的任务，不抛异常。
         *  DiscardOldestPolicy：当任务添加到线程池中被拒绝时，丢弃任务队列中最久没有被处理的任务，然后把被拒绝的任务放到等待队列中去。
         *  CallerRunsPolicy：被拒绝的任务处理程序，直接在execute方法的调用线程中运行被拒绝的任务。
         *                      总结：就是被拒绝的任务会被在主线程中运行，不在进入线程池。
         */

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在执行!!!");
            });
            threadPoolExecutor.execute(thread);
        }
        /**
         * 执行结果：
         * pool-1-thread-2正在执行!!!
         * main正在执行!!!
         * pool-1-thread-1正在执行!!!
         * pool-1-thread-2正在执行!!!
         * main正在执行!!!
         * pool-1-thread-1正在执行!!!
         * pool-1-thread-1正在执行!!!
         * pool-1-thread-2正在执行!!!
         * main正在执行!!!
         * pool-1-thread-1正在执行!!!
         *
         *      由此可见：当线程池中的线程池超过最大限制时，被拒绝的任务会被 main 线程执行。
         */

        threadPoolExecutor.shutdown();  //  有序的关闭线程池，将原有的任务执行完，不在接收新的任务，原有的任务执行完后关闭线程池。
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadPoolExecutor.isShutdown());

        System.out.println(threadPoolExecutor.toString());//打印线程池对象
        System.out.println(threadPoolExecutor.getActiveCount());    //获取线程超时时间
        System.out.println(threadPoolExecutor.getCompletedTaskCount());     //返回已经执行完的任务的个数
        System.out.println(threadPoolExecutor.getMaximumPoolSize());        //返回最大线程数
        System.out.println(threadPoolExecutor.getPoolSize());       //返回线程池中当前时间的线程数量
        System.out.println(threadPoolExecutor.getTaskCount());      //返回计划执行的任务打大概总数
    }
}
