package com.piperplatform.javaconcurrency.sharing.chapter1;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 12:23 下午
 * @Version 1.0
 */
public class TryConcurrency {
    public static void main(String[] args) {
        /**
         * jps:jps是用于查看有权访问的hotspot虚拟机的进程
         * Jconsole是JDK自带的监控工具，在JDK/bin目录下可以找到。
         * 它用于连接正在运行的本地或者远程的JVM，对运行在java应用程序的资源消耗和性能进行监控，
         * 并画出大量的图表，提供强大的可视化界面。而且本身占用的服务器内存很小，甚至可以说几乎不消耗。
         */
        /**
         * 实例线程对象只是对象,start后才启动为线程
         * 立即返回
         * main方法启动两个线程后,没有后续的任务(阻塞之类的)直接结束主线程
         * start启动线程方法执行后,将会开启两个线程:要执行的线程,执行线程的线程
         * 同一个线程只能执行一次
         */
        new Thread("READ Thread") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                readDataFromDataBase();
            }
        }.start();
        new Thread("WRITE Thread") {
            @Override
            public void run() {
                writeDataToFile();
            }
        }.start();
        /**
         * 线程声明周期
         * 1.实例化 new Thread();
         * 2.启动线程 start();
         * 3.可执行状态 runnable
         * 4.等待调度 dispatch
         * 5.运行中 running 调度过程中 执行权交换 -> runnable
         * 6.可能的阻塞锁 blocked -> 解锁后回到runnable 等待
         * 7.终结 terminated
         */
    }

    private static void readDataFromDataBase() {
        try {
            println("Begin read data from db.");
            Thread.sleep(1000 * 5L);
            println("Read data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successfully.");
    }

    private static void writeDataToFile() {
        try {
            println("Begin write data from file.");
            Thread.sleep(1000 * 5L);
            println("write data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successfully.");
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
