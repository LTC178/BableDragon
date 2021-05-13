package com.static_agent;

public class HouseAgency implements RentHouse{
    private RentHouse target;
    
    public HouseAgency(RentHouse target) {
        this.target = target;
    }

    @Override
    public void toRentHouse() {
        // TODO Auto-generated method stub
        System.out.println("我可以帮忙租房...");
        target.toRentHouse();
        System.out.println("马上准备合同");
    }
    
    
}
