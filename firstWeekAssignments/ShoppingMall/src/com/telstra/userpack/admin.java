package com.telstra.userpack;

import java.util.ArrayList;

import com.telstra.pack1.Product;

public class admin extends User{
	private static String password = "abcd" ;
	public boolean addProduct(int id, String name, int price) {
		Product p = new Product(id,name,price);
		return p.add();
	}
	
	public boolean updatePrice(Product p,int price) {
		p.setPrice(price);
		return true;
	}
	
	
	public boolean deleteProduct(int id) {
		//DB action
		
		return true;
	}
	
	public String getPassword() {
		return this.password;
	}
	
}
