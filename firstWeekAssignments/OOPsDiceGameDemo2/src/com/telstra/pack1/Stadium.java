package com.telstra.pack1;

public class Stadium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		Player p2 = new Player();
		int p1Score = p1.play();
		
		int p2Score = p2.play();
		
		System.out.println(p1.getD1Score());
		System.out.println(p1.getD2Score());
		
		System.out.println(p2.getD1Score());
		System.out.println(p2.getD2Score());
		
		if(p1Score > p2Score) {
			System.out.println("Player 1 won the game");
		}
		else if(p1Score == p2Score) {
			System.out.println("There is a tie");
		}
		else {
			System.out.println("Player 2 won the game");
		}
	}

}
