package com.teltra.ipack1;

public class Car extends Vehicle {
	private int maxSped;
	private String type;
	

	
	
	public Car(int regNo, String modal, int currSpeed, int maxSped, String type) {
		super(regNo, modal, currSpeed);
		this.maxSped = maxSped;
		this.type = type;
	}




	@Override
	public int increaseSpeed(int n) {
		// TODO Auto-generated method stub
		
		if(currSpeed+n< maxSped) {
			return currSpeed+n;
		}
		return 0;
	}




	public int getMaxSped() {
		return maxSped;
	}
	
}
