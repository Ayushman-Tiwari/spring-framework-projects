package com.ayushman.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcore/map/mapconfig.xml");
		
		Customer bean = (Customer) ctx.getBean("customer");
		System.out.println("Car Dealer name: "+bean.getId());
		System.out.println("Car Dealer Models: "+bean.getProducts());
		System.out.println("Car Dealer Models: "+bean.getProducts().getClass());
	}

}
