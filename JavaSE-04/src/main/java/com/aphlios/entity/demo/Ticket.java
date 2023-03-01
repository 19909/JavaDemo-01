package com.aphlios.entity.demo;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/1  19:11
 * @PackageName: com.aphlios.entity
 * @ClassName: Ticket
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      多线程抢票案例
 */
public class Ticket implements Runnable{

    private int tick = 50;

    public Ticket() {
    }

    public Ticket(int tick) {
        this.tick = tick;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.printf("%s:线程启动%n",threadName);
        while (true){
            synchronized (this){
                if (tick < 1) {
                    break;
                }
                System.out.printf("%s:售出一张票(座号:%d)，剩余%d张票%n",threadName,tick,--tick);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.printf("%s:线程结束%n",threadName);
    }
}
