package com.ayushman.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcore/properties/propertiesconfig.xml");
		
		Languages bean = (Languages) ctx.getBean("languages");
		System.out.println("Car Dealer Models: "+bean.getCountryAndLang());
		System.out.println("Car Dealer Models: "+bean.getCountryAndLang().getClass());
	}

}
