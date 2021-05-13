package com.xxxx.seckill;

public class HungerSingleon {
    private int val;
    private String id;

    HungerSingleon() {
        val = 0;
        id = "HungerSingleon";
    }

    HungerSingleon(int val, String id) {
        this.val = val;
        this.id = id;
    }

    private static HungerSingleon instance = new HungerSingleon();

    public static HungerSingleon getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "HungerSingleon [id=" + id + ", val=" + val + "]";
    }

}
