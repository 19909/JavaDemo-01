package com.aphlios.entity.demo;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/1  19:10
 * @PackageName: com.aphlios.entity
 * @ClassName: SellTicket
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class SellTicket {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        Thread thread1 = new Thread(ticket, "A窗口:");
        Thread thread2 = new Thread(ticket, "B窗口:");
        Thread thread3 = new Thread(ticket, "C窗口:");
        Thread thread4 = new Thread(ticket, "D窗口:");

        thread1.start();thread2.start();thread3.start();thread4.start();
    }
}
