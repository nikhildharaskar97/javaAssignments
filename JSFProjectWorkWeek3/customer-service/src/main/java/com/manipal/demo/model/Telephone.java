package com.manipal.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Telephone {

	private int telephoneId;
	private long telephoneNumber;
	private long mobileNumber;
	public Telephone() {}
	public Telephone(int telephoneId, long telephoneNumber, long mobileNumber) {
		super();
		this.telephoneId = telephoneId;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
	}
	public int getTelephoneId() {
		return telephoneId;
	}
	public void setTelephoneId(int telephoneId) {
		this.telephoneId = telephoneId;
	}
	public long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Telephone [telephoneId=" + telephoneId + ", telephoneNumber=" + telephoneNumber + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	
}
