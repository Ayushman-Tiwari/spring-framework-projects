package com.ayushman.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayushman.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ayushman/spring/springaop/test/config.xml");

		ProductService bean = (ProductService) ctx.getBean("productService");

		System.out.println(bean.multiply(4, 5));

	}

}
