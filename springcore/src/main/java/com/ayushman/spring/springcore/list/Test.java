package com.ayushman.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springcore/list/listconfig.xml");

		Hospital bean = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital name: "+bean.getName());
		System.out.println("Hospital departments: "+bean.getDepartments());
		System.out.println("departments are of type: "+bean.getDepartments().getClass());
	}

}
