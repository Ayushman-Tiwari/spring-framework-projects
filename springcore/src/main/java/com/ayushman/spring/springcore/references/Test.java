package com.ayushman.spring.springcore.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcore/references/refTypeConfig.xml");
		
		Student bean = (Student) ctx.getBean("student");
		System.out.println("Student scores: "+bean.getScores());
		
	}

}
