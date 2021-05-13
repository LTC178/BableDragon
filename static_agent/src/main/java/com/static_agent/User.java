package com.static_agent;

public class User implements RentHouse, Marry{

    @Override
    public void toRentHouse() {
        // TODO Auto-generated method stub
        System.out.println("我要租一个三室一厅的房间...");
    }

    @Override
    public void toMarry() {
        // TODO Auto-generated method stub
        System.out.println("我要结婚了...");
    }
}