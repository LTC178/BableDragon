package com.dymatic;

public class Starter {
    public static void main(String[] args) {
        
        // 设置目标对象用来初始化代理类
        RentHouse rentHouse_Target = new User();

        // 获取代理类
        JDKProxy rentHouse_jdkProxy = new JDKProxy(rentHouse_Target);

        // 调用代理类中的方法，获取代理对象
        RentHouse rentHouse = (RentHouse) rentHouse_jdkProxy.getProxy();

        // 执行目标类中的方法
        rentHouse.toRentHouse();

        Marry marry_Target = new User();
        JDKProxy marry_jdkProxy = new JDKProxy(marry_Target);
        Marry marry = (Marry) marry_jdkProxy.getProxy();
        marry.toMarry();
        System.out.println(marry.toMarry2());
    }
}
