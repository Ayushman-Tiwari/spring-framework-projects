package com.ayushman.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springjdbc/config.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");

		String sql = "insert into Employee values(?,?,?)";

		int result = jdbcTemplate.update(sql, 1, "Ayushman", "Tiwari");

		System.out.println("Number of records inserted are: " + result);

	}

}
