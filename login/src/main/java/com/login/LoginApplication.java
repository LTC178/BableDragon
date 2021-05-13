package com.login;

import com.login.controller.UserController;
import com.login.vo.MessageModel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring.xml");
		UserController userController = (UserController) cp.getBean("userController");
		MessageModel messageModel = userController .userLogin("admin", "123456");
		System.out.println(messageModel);
		cp.close();
	}

}
