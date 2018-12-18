package com.test.threadlocal;

public class Run {
    public static void main(String[] args) {
        ThreadA threadA=new ThreadA();
        threadA.start();
        ThreadB theadB =new ThreadB();
        theadB.start();
        for (int i = 0; i <5 ; i++) {
            Tool.threadLocal.set(i);
            System.out.println("MainThread get Value=" + Tool.threadLocal.get());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
