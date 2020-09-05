package com.telstra.pack1;

public class Product {
	private int id;
	private String name;
	private int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public boolean setPrice(int price) {
		this.price = price;
		
		//Db action
		
		return true;
	}
	
	public boolean add() {
		
		//Db action
		
		return true;
	}
	
	
	
}
