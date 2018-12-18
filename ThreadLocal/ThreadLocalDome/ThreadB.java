package com.test.threadlocal;

public class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            Tool.threadLocal.set(i);
            System.out.println("ThreadB get Value=" + Tool.threadLocal.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
