package com.telstra.pack1;

import java.util.ArrayList;

public class User {

	
	private int id;
	private Directory dir;
	public User(int id, Directory d) {
		super();
		this.id = id;
		this.dir = d;
	}
	
	public ArrayList<State> retriveStates(){
		return dir.getStates();
	}
	
	
	public ArrayList<Location> retriveLocations(State s){
		return s.getLocations();
	}
}
