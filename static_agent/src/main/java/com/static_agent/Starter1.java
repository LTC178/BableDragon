package com.static_agent;

public class Starter1 {
    public static void main(String[] args) {
        RentHouse target = new User();
        HouseAgency houseAgency = new HouseAgency(target);
        houseAgency.toRentHouse();
        
        Marry marry = new User();
        MarryCompany marryCompany = new MarryCompany(marry);
        marryCompany.toMarry();
       
    }
}
