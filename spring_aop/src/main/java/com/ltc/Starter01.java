package com.ltc;

import com.ltc.dao.UserDao;
import com.ltc.service.UserService;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter01 {
    public static void main(String[] args) {

        // 得到上下文环境
        // ClassPathXmlApplicationContext cp = new
        // ClassPathXmlApplicationContext("spring01.xml");

        // UserService userService = (UserService) cp.getBean("userService");
        // userService.test();

        // UserDao userDao = (UserDao) cp.getBean("userDao");
        // userDao.test();
        System.out.println("okkkk");
    }
}
