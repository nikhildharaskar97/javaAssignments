package com.telstra.pack1;

public class Main {
	public static void main(String[] args) {
		Baby b1 = new Baby("xyz",3.2);
		Baby b2 = new Baby("abc",2.2);
		Baby b3 = new Baby("jkl",4.8);
		
		System.out.println( Classifier.classify(b1));
		System.out.println( Classifier.classify(b2));
		System.out.println( Classifier.classify(b3));
		
	}
}
