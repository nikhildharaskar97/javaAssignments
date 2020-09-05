package com.telstra.userpack;
import java.util.ArrayList;
import com.telstra.pack1.Product;


public class Customer extends User{
	private String username;
	
	ArrayList<Product> cart ;
	
	public boolean addInCart(Product p) {
		//DB Action
		
		return true;
	}
	
	public boolean removeFromCart(Product p) {
		//DB Action
		
		return true;
	}
	
	public boolean placeOrder() {
		
		cart = new ArrayList<Product>();
		
		//DB Action
		return true;
	}
	
	public ArrayList<Product> printpill() {
		return this.cart;
	}
	
	
	
}
