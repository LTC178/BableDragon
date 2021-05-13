package com.xxxx.seckill;

public class LazySingleon {
    private int val;
    private String id;

    private volatile static LazySingleon instance = null;

    LazySingleon() {
        val = 0;
        id = "LazySingleon";
    }

    public LazySingleon(int val, String id) {
        this.val = val;
        this.id = id;
    }

    static public LazySingleon GetInstance() {
        if (instance == null) {
            synchronized (LazySingleon.class) {
                instance = new LazySingleon();
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazySingleon [id=" + id + ", val=" + val + "]";
    }

}
