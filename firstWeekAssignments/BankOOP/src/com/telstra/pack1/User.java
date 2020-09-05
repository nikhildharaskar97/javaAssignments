package com.telstra.pack1;

public class User {
	private int id;
	private Account acc = new Account(100);
	
	
	
	public User(int id) {
		super();
		this.id = id;
	}
	
	public String displayBalance() {
		return("Your Balance is "+acc.getAmount()+"rupees!");
	}

	public String deposit(int amt) {
		if(acc.addAmount(amt)) {
			return("Amount "+amt + "is added. Total balance is "+acc.getAmount()+".");
		}
		return ("Technical error");
	}
	
	public String withdraw(int amt) {
		if(acc.subAmount(amt)) {
			return("Amount "+amt + "is withdrawn. Total balance is "+acc.getAmount()+".");
		}
		return ("Insufficient funds");
		
	}
}
