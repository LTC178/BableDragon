package com.ltc;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcTest {

    /**
     * 没有参数的查询操作
     */
    @Test
    public void testJdbc() {
        // 得到上下文环境
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("okkkk");
        // 得到模板类
        // JdbcTemplate jdbcTemplate = (JdbcTemplate) cp.getBean("jdbcTemplate");

        // // 查询操作
        // String sql = "select count(1) from tb_account";
        // Integer total = jdbcTemplate.queryForObject(sql, Integer.class);
        // System.out.println("得到的总记录数：" + total);
    }

    /**
     * 有参数的查询操作
     */
    @Test
    public void testJdbc02() {
        // 得到上下文环境
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring.xml");
        // 得到模板类
        JdbcTemplate jdbcTemplate = (JdbcTemplate) cp.getBean("jdbcTemplate");

        // 查询操作
        String sql = "select count(1) from tb_account where accountId = ? and accountName = ?";
        Integer total = jdbcTemplate.queryForObject(sql, Integer.class, 1, "admin");
        System.out.println("得到的总记录数：" + total);
    }
}
