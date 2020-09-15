package com.manipal.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_first_name")
	private String customerFirstName;
	
	@Column(name="customer_last_name")
	private String customerLastName;
	
	@Column(name="customer_dateof_birth")
	private Date customerDateofBirth;
	private Telephone telephone;
	
	@Column(name="customer_email")
	private String customerEmail;
	
	public Customer() {}
	public Customer(int customerId, String customerFirstName, String customerLastName, Date customerDateofBirth,
			Telephone telephone, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerDateofBirth = customerDateofBirth;
		this.telephone = telephone;
		this.customerEmail = customerEmail;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public Date getCustomerDateofBirth() {
		return customerDateofBirth;
	}
	public void setCustomerDateofBirth(Date customerDateofBirth) {
		this.customerDateofBirth = customerDateofBirth;
	}
	public Telephone getTelephone() {
		return telephone;
	}
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerDateofBirth=" + customerDateofBirth + ", telephone=" + telephone
				+ ", customerEmail=" + customerEmail + "]";
	}
	
	
	
}

/*{
	"customerId":123,
	"customerFirstName":"nikhil",
	"customerLastName":"dharaskar",
	"customerDateofBirth":"2018-12-10",
	"telephone":{
					"telephoneId" :1234,
					"telephoneNumber":12345645,
					"mobileNumber":123544
	
				},
	"customerEmail":"nikhil@gmail.com"
}*/