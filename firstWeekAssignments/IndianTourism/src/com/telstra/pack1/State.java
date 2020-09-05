package com.telstra.pack1;

import java.util.ArrayList;

public class State {

	
	private String sName;
	
	private ArrayList<Location> locations = new ArrayList<Location>();
	
	public State(String sName) {
		this.sName = sName;
		
	}
	
	public String getName() {
		return this.sName;
	}
	
	public Boolean addLocation(Location loc) {
		
		this.locations.add(loc);
		
		return true;
	}
	
	public ArrayList<Location> getLocations() {
		return this.locations;
	}
	
}
