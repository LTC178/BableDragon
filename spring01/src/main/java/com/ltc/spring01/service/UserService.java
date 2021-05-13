package com.ltc.spring01.service;

import javax.annotation.Resource;

import com.ltc.spring01.dao.AccountDao;
import com.ltc.spring01.dao.UserDao;

public class UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private AccountDao accountDao;

    public void test() {
        System.out.println("UserService...");
        userDao.test();
        accountDao.test();
    }
}