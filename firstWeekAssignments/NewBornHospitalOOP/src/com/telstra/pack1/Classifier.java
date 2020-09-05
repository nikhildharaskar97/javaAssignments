package com.telstra.pack1;

public class Classifier{
	
	public static String classify(Baby baby) {
		if(baby.getWt()<2.5) {
			return("Baby "+baby.getName()+" with weight "+baby.getWt()+" kg is undernourished.");
		}
		else if(baby.getWt()>4.5) {
			return("Baby "+baby.getName()+" with weight "+baby.getWt()+" kg is overnourished.");
		}
		
		return ("Baby "+baby.getName()+" with weight "+baby.getWt()+" kg is healthy!");
	}
	
}
