package com.ayushman.spring.springcore.assignment;

import java.util.Map;

public class Item {

	private Map<Integer, String> listOfItems;

	public Map<Integer, String> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(Map<Integer, String> listOfItems) {
		this.listOfItems = listOfItems;
	}

	@Override
	public String toString() {
		return "Item [listOfItems=" + listOfItems + "]";
	}
	
	
	
}
