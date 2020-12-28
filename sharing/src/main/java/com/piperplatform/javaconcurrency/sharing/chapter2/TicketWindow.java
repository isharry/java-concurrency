package com.piperplatform.javaconcurrency.sharing.chapter2;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 1:35 下午
 * @Version 1.0
 */
public class TicketWindow extends Thread {
    private String windowName;
    private static final int MAX = 50;
    private static int index = 1;

    public TicketWindow(String windowName) {
        this.windowName = windowName;
    }

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(windowName + " 当前队列号 => " + index++);
        }
    }
}
