package com.ayushman.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcore/set/setconfig.xml");
		
		CarDealer bean = (CarDealer) ctx.getBean("dealer");
		System.out.println("Car Dealer name: "+bean.getName());
		System.out.println("Car Dealer Models: "+bean.getModels());
		System.out.println("Car Dealer Models: "+bean.getModels().getClass());
	}

}
