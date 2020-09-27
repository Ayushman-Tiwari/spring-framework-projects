package com.ayushman.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		// Assignment One
		/*
		 * ApplicationContext ctx = new ClassPathXmlApplicationContext
		 * ("com/ayushman/spring/springcore/assignment/democonfig.xml");
		 * 
		 * ShoppingCart cart = (ShoppingCart) ctx.getBean("shoppingCart");
		 * System.out.println(cart.getItems());
		 */
		
		
		// Assignment Two
		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("com/ayushman/spring/springcore/assignment/democonfig2.xml");
		
		University university = (University) ctx.getBean("university");
		System.out.println(university);
		
	}

}
