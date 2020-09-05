package com.telstra.pack1;

public class Player {
	private Dice d1;
	
	private int d1Score;
	private int d2Score;
	
	private Dice d2;
	
	public Player() {
		super();
		d1 = new Dice();
		d2 = new Dice();
	}
	
	
	
	public int play() {
		d1Score = d1.roll();
		d2Score = d2.roll();
		return(d1Score+d2Score);
		
	}



	

	public int getD1Score() {
		return d1Score;
	}

	public int getD2Score() {
		return d2Score;
	}


	
	
}
