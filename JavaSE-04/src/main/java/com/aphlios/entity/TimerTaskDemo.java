package com.aphlios.entity;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/1  17:24
 * @PackageName: com.aphlios.entity
 * @ClassName: TimerTaskDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      线程中TimerTask工具类
 */
public class TimerTaskDemo {

    public static void main(String[] args) {
        Timer timer = new Timer();

        /**
         *
         *  public void schedule(TimerTask task, Date time)                     //任务 + 指定时间Date类型         到指定时间时启动TimerTask中的run()方法
         *  public void schedule(TimerTask task, long delay)                    //任务 + 指定时间（毫秒）
         *  public void schedule(TimerTask task, long delay, long period)       //任务 + 指定时间（毫秒） + 运行几次
         *  public void schedule(TimerTask task, Date firstTime, long period)   //任务 + 指定时间（毫秒） + 运行几次
         *
         *  schedule方法运行之后 默认 线程是不会结束的，需要手动结束进程的生命周期。使用Timer类中的 cancel方法来结束进程
         *      如果想要在程序运行结束后关闭线程，在TimerTask类中的run()方法的最后面使用Timer.cancel(),来终止线程。
         *
         *  cancel() 终止此计时器，丢弃所有当前已安排的任务。
         */

        //TimerTask定时任务类
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.printf("%tF %<tT %n",System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                    timer.purge();      //从此计数器的任务队列中移除所有已经取消的任务。
//                timer.cancel(); //
            }
        }, Calendar.getInstance().getTime());

        timer.cancel();     //可能出现异常，如果线程还没有执行完，就关闭的话，就会出现不可预期的结果。

    }
}
