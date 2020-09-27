package com.ayushman.spring.springcoreadvanced.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcoreadvanced/stereotypeAnnotations/config.xml");
		
		Instructor inst = (Instructor) ctx.getBean("inst");
		
		System.out.println(inst);
		
        Instructor inst2 = (Instructor) ctx.getBean("inst");
		
		System.out.println(inst2);
	}

}
