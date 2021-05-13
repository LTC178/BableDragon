package com.login.service;

import javax.annotation.Resource;

import com.login.dao.UserDao;
import com.login.po.User;
import com.login.vo.MessageModel;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    // 注入
    @Resource
    private UserDao userDao;

    public MessageModel userLogin(String userName, String userPwd) {

        MessageModel messageModel = new MessageModel();
        // 参数的非空校验
        if (userName == null || "".equals(userName.trim())) { // trim 去除userName中前缀或者后缀的空格
            messageModel.setCode(0);
            messageModel.setMsg("用户名不能为空");
            return messageModel;
        }
        if (userPwd == null || "".equals(userPwd.trim())) {
            messageModel.setCode(0);
            messageModel.setMsg("密码不能为空");
            return messageModel;
        }

        // 调用Dao层的查询方法判断用户对象是否存在
        User user = userDao.querryUserByName(userName);
        if (user == null) {
            messageModel.setCode(0);
            messageModel.setMsg("用户对象不存在");
            return messageModel;
        }

        // 比较密码是否正确

        if (!user.getUserPwd().equals(userPwd)){
            messageModel.setCode(0);
            messageModel.setMsg("用户密码错误");
            return messageModel;
        }
        messageModel.setCode(1);
        messageModel.setMsg("SUCCESS");
        return messageModel;

    }
}
