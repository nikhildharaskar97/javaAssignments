package com.telstra.pack1;

public class Account {
	private int amount;
	
	public Boolean addAmount(int amt) {
		this.amount += amt;
		return true;
	}
	public Boolean subAmount(int amt) {
		if(amt>this.amount) {
			return false;
		}
		this.amount-=amt;
		return true;
	}
	
	public Account(int amt) {
		this.amount=amt;
	}
	
	
	public int getAmount() {
		return this.amount;
	}
	
	
}
