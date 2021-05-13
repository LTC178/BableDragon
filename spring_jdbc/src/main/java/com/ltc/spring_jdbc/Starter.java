package com.ltc.spring_jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Starter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("okkkk");
        // 得到模板类
        JdbcTemplate jdbcTemplate = (JdbcTemplate) cp.getBean("jdbcTemplate");

        // 查询操作
        // String sql = "select count(1) from tb_account";
        // Integer total = jdbcTemplate.queryForObject(sql, Integer.class);
        // System.out.println("得到的总记录数：" + total);
        cp.close();
        System.out.println("okkkkkk");
    }
}
