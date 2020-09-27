package com.ayushman.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Employee bean = (Employee) ctx.getBean("emp");
		System.out.println("Employee id: " + bean.getId());
		System.out.println("Employee name: "+ bean.getName());
		
	}

}
