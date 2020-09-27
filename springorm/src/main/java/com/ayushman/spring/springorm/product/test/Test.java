package com.ayushman.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayushman.spring.springorm.entity.Product;
import com.ayushman.spring.springorm.product.dao.ProductDao;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/ayushman/spring/springorm/product/test/config.xml");

		ProductDao dao = (ProductDao) ctx.getBean("productDao");

		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDesc("Apple's flagship phone which runs on iOS");
		product.setPrice(850.750);

//		dao.create(product);
		
//		dao.update(product);
	
//		dao.delete(product);
	
//		Product product2 = dao.find(1);
//		System.out.println(product2);

		List<Product> listofProducts = dao.findAll();
		System.out.println(listofProducts);
		
	}

}
