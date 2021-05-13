package com.dymatic;

public class User implements RentHouse, Marry {

    @Override
    public void toRentHouse() {
        // TODO Auto-generated method stub
        System.out.println("我要租房...");
    }

    @Override
    public void toMarry() {
        // TODO Auto-generated method stub
        System.out.println("我要结婚...");
    }

    @Override
    public String toMarry2() {
        // TODO Auto-generated method stub
        return "二婚";
    }

}
