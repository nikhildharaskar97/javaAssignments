package com.telstra.pack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User(123);
		
		System.out.println(u1.displayBalance());
		System.out.println(u1.withdraw(1000));
		System.out.println(u1.deposit(2000));
		System.out.println(u1.withdraw(1000));
		
		
		
		
		

	}

}
