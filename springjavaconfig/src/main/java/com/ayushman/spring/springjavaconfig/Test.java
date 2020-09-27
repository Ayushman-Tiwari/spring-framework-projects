package com.ayushman.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Service bean = (Service) ctx.getBean("service");
		
		//bean.save();
		
		Service bean2 = (Service) ctx.getBean("service");
		
		System.out.println(bean.hashCode());
		System.out.println(bean2.hashCode());
		
		ctx.close();
	}

}
