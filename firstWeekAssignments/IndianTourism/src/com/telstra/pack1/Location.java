package com.telstra.pack1;

public class Location {

	private String name;
	private int pin;
	public Location(String name, int pin) {
		super();
		this.name = name;
		this.pin = pin;
	}
	
	public int getPin() {
		return this.pin;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
}
