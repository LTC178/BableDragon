package com.login.dao;

import com.login.po.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    // 设置姓名和密码
    private final String USERNAME = "admin";
    private final String USERPWD = "123456";

    public User querryUserByName(String userName) {
        // 判断用户名是否存在
        if (!USERNAME.equals(userName))
            return null;
        User user = new User();
        user.setUserName(userName);
        user.setUserPwd(USERPWD);
        user.setUserId(1);
        return user;
    }
}
