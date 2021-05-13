package com.static_agent;

public class MarryCompany implements Marry {

    private Marry target;

    public MarryCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void toMarry() {
        // TODO Auto-generated method stub
        System.out.println("马上准备结婚场所...");
        target.toMarry();
        System.out.println("马上领结婚证...");
    }

}
