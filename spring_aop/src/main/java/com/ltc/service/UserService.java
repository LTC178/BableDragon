package com.ltc.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void test() {
        int i = 1 / 0;
        System.out.println("UserService...");
    }

}
