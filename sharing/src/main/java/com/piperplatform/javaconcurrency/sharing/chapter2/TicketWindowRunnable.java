package com.piperplatform.javaconcurrency.sharing.chapter2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 1:45 下午
 * @Version 1.0
 */
public class TicketWindowRunnable implements Runnable {
    private static final int MAX = 50;
    private AtomicInteger atomicInteger = new AtomicInteger(1);
    private int index = 1;
    @Override
    public void run() {
        while (atomicInteger.get() <= MAX) {
            doWork(atomicInteger);
        }
    }
    private synchronized void doWork(AtomicInteger atomicInteger){
        if (atomicInteger.get() > MAX){
            return;
        }
        System.out.println(Thread.currentThread() + " 当前队列号=> " + atomicInteger.getAndIncrement());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
