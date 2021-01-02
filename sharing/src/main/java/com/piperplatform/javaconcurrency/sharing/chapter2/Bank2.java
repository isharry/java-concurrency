package com.piperplatform.javaconcurrency.sharing.chapter2;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 1:49 下午
 * @Version 1.0
 */
public class Bank2 {
    public static void main(String[] args) {
        TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();
        Thread t1 = new Thread(ticketWindowRunnable, "一号窗口");
        Thread t2 = new Thread(ticketWindowRunnable, "二号窗口");
        Thread t3 = new Thread(ticketWindowRunnable, "三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
