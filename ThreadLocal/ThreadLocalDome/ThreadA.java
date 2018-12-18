package com.test.threadlocal;

public class ThreadA extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            Tool.threadLocal.set(i);
            System.out.println("ThreadA get Value=" + Tool.threadLocal.get());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
