package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="telephones")
public class Telephone {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="telepone_id")
	private int telephoneId;
	
	@Column(name="telepone_number")
	private long telephoneNumber;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	public Telephone() {}
	public Telephone(int telephoneId, long telephoneNumber, long mobileNumber, int customerId) {
		super();
		this.telephoneId = telephoneId;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.customerId=customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
		result = prime * result + telephoneId;
		result = prime * result + (int) (telephoneNumber ^ (telephoneNumber >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		if (customerId != other.customerId)
			return false;
		if (mobileNumber != other.mobileNumber)
			return false;
		if (telephoneId != other.telephoneId)
			return false;
		if (telephoneNumber != other.telephoneNumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Telephone [telephoneId=" + telephoneId + ", telephoneNumber=" + telephoneNumber + ", customerId="
				+ customerId + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
}
