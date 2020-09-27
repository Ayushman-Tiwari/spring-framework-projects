package com.ayushman.spring.springcore.assignment;

import org.springframework.beans.factory.annotation.Required;

public class University {

	private int id;
	
	private String name;
	
	private String branch;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	
}
