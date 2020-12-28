package com.piperplatform.javaconcurrency.sharing.chapter2;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 1:37 下午
 * @Version 1.0
 */
public class Bank {
    public static void main(String[] args) {
        TicketWindow t1 = new TicketWindow("一号柜台");
        t1.start();
        TicketWindow t2 = new TicketWindow("二号柜台");
        t2.start();
        TicketWindow t3 = new TicketWindow("三号柜台");
        t3.start();
    }
}
