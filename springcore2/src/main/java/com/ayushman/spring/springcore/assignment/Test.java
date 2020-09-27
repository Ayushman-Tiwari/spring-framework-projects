package com.ayushman.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcore/assignment/config.xml");
		
		TestDAO testDAO = (TestDAO) ctx.getBean("testDAO");
		
		System.out.println(testDAO);
	}

}
