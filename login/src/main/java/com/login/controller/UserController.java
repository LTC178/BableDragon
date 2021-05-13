package com.login.controller;

import javax.annotation.Resource;

import com.login.po.User;
import com.login.service.UserService;
import com.login.vo.MessageModel;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    public MessageModel userLogin(String userName, String userPwd) {
        // 调用service层的方法
        MessageModel messageModel = userService.userLogin(userName, userPwd);
        return messageModel;
    }
}
