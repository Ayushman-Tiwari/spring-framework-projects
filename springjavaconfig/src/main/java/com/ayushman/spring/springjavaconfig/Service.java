package com.ayushman.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	Dao dao;
	
	public void save() {
		dao.create();
	}
	
	public void init() {
		System.out.println("init()");
	}
	
	public void destroy() {
		System.out.println("destroy()");
	}
	
}
