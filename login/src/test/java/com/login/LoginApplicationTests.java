package com.login;

import com.login.controller.UserController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class LoginApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testUserLogin() {
		// 得到spring的上下文环境
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring.xml");
		// 得到对应的bean对象
		//UserController userController = (UserController) cp.getBean("userController");
		//userController.userLogin("admin", "123");
	}
}
