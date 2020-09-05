package com.telstra.pack1;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<State> states;
		
		ArrayList<Location> locations;
		
		
		Directory d = new Directory();
		
		d.addState(new State("Maharahtra"));
		d.addState(new State("Gujarat"));
		d.addState(new State("Karnataka"));
		
		states = d.getStates();
		
		
		states.get(0).addLocation(new Location("Mumbai",1234));
		states.get(0).addLocation(new Location("Pune",1234));
		states.get(0).addLocation(new Location("Lonavala",1256));
		
		System.out.println(d.getStates().get(0).getName());
		
		System.out.println(d.getStates().get(0).getLocations().get(0).getName());
		System.out.println(d.getStates().get(0).getLocations().get(0).getPin());
		System.out.println(d.getStates().get(0).getLocations().get(1).getName());
		System.out.println(d.getStates().get(0).getLocations().get(1).getPin());
		

	}

}
