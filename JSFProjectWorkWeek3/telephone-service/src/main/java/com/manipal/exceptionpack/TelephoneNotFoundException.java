package com.manipal.exceptionpack;

public class TelephoneNotFoundException extends RuntimeException{

	public TelephoneNotFoundException(String message) {
		super(message);
	}
}
