package com.ayushman.spring.springcoreadvanced.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcoreadvanced/standaloneCollections/config.xml");
		
		ProductsList pl = (ProductsList) ctx.getBean("productsList");
		
		System.out.println(pl.getProductNames());
	}

}
