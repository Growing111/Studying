package com.ly.test;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class a= Object.class;
        System.out.println(a.toString());

        Object o=new Object();
        Class b=o.getClass();
        System.out.println(b.getName());


        Class c=Class.forName("java.lang.Object");
        System.out.println(c.getSimpleName());
    }
}
