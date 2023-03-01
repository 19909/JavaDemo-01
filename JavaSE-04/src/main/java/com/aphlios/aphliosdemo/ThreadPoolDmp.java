package com.aphlios.aphliosdemo;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/1  10:58
 * @PackageName: com.aphlios.aphliosdemo
 * @ClassName: ThreadPoolDmp
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class ThreadPoolDmp {
    public static void main(String[] args) {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

        /*
        *
        *      参数                                      含义                              解释
        *
        *       int corePoolSize,                   线程池中的核心线程数            核心线程生命周期无限，即使空闲也不会被销毁
        *       int maximumPoolSize,                线程池中最大线程数             当任务队列满了之后，再进来的新任务，就会增加一个线程来处理新任务。
        *       long keepAliveTime,                 线程闲置超时时间              当线程数大于核心线程数，线程闲置时间超过keepAliveTime时间将会回收非核心线程。
        *       TimeUnit unit,                      设置超时时间的单位
        *       BlockingQueue<Runnable> workQueue,  线程池中的任务队列             存放任务<Runnable>的容器
        *       ThreadFactory threadFactory,        为线程池提供创建新线程的线程工厂
        *       RejectedExecutionHandler handler    拒绝策略                    新增一个任务到线程池，如果线程池任务队列超过最大值后，并且已经开启到最大线程数时，默认抛出ERROR异常。
         *
         */




    }
}
