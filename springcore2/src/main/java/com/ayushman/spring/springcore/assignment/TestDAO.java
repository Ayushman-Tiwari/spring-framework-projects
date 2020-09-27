package com.ayushman.spring.springcore.assignment;

public class TestDAO {

	private String url;
	private String userName;
	private String password;
	
	public TestDAO(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "TestDAO [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
