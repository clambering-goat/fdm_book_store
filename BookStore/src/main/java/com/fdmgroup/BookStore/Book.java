package com.fdmgroup.BookStore;

import java.util.HashMap;

public class Book {
	private double price;
	private HashMap<String, Double > discounts  = new HashMap<String, Double>();

	Book(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	

	

	public void money_off(String key,Double discount) {
		discounts.put(key,discount);
		this.price = this.price/2;

	}


	


}
