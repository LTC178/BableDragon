package com.test;

public class SingletonInstance {
    private static SingletonInstance singletonInstance = new SingletonInstance();

    private SingletonInstance() {
    }

    public static SingletonInstance getInstance() {
        return singletonInstance;
    }

    public void test() {
        System.out.println("SingletonInstance");
    }
}
