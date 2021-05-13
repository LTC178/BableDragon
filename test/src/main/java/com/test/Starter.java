package com.test;

public class Starter {
    public static void main(String[] args) {
        SingletonInstance.getInstance().test();
        LazySingleton.getInstance().test();
        System.out.println("1111");
        System.out.println("1111");
    }
}
