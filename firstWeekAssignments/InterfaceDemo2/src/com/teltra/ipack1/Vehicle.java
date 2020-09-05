package com.teltra.ipack1;

public abstract class Vehicle implements Automobile{
	protected int regNo;
	protected String modal;
	protected int currSpeed;
	public Vehicle(int regNo, String modal, int currSpeed) {
		super();
		this.regNo = regNo;
		this.modal = modal;
		this.currSpeed = currSpeed;
	}
	@Override
	public String start() {
		// TODO Auto-generated method stub
		return ("Vehicle started");
		
	}
	@Override
	public abstract int increaseSpeed(int n) ;
		
	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return ("Vehicle Stopped");
		
	}
	
	

}
