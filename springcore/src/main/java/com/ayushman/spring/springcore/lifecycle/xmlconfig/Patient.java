package com.ayushman.spring.springcore.lifecycle.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("Inside Hi method which acts as an init method");
	}
	
	public void bye() {
		System.out.println("Inside Bye method which acts as destroy method");
	}
	
}
