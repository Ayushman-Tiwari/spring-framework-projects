package com.ayushman.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	// first kind of ambiguity
	/*
	 * Addition(Double a, Double b) {
	 * System.out.println("Inside constructor DOUBLE"); }
	 * 
	 * Addition(int a, int b) { System.out.println("Inside constructor INT"); }
	 * 
	 * Addition(String a, String b) {
	 * System.out.println("Inside constructor String"); }
	 */
	
	// second kind of ambiguity
	Addition(int a, double b){
		System.out.println("Inside Constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
}
