package com.ltc.spring01;

import com.ltc.spring01.dao.UserDao;
import com.ltc.spring01.service.UserService;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring1.xml");
        UserService userService = (UserService) cp.getBean("userService");
        userService.test();
        // userDao.test();
    }
}