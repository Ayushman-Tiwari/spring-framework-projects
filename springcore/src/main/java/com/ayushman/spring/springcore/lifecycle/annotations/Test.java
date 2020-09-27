package com.ayushman.spring.springcore.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/ayushman/spring/springcore/lifecycle/annotations/config.xml");

		Patient bean = (Patient) ctx.getBean("patient");
		System.out.println("Car Dealer Id: " + bean.getId());
		ctx.registerShutdownHook();

	}

}
