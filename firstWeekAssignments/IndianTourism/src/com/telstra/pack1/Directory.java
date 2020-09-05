package com.telstra.pack1;

import java.util.ArrayList;

public class Directory {
	private ArrayList<State> states = new ArrayList<State>();
	
	public boolean addState(State state) {
		this.states.add(state);
		return true;
	}
	
	
	public ArrayList<State> getStates(){
		return this.states;
	}
	
}
