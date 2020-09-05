package com.telstra.emp;

public abstract class Employee {
	protected int empId;
	protected String empName;
	protected int bSal;
	
	
	public Employee(int empId, String empName, int bSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.bSal = bSal;
	}
	public String getDetails() {
		return("Id: "+empId+" Name:"+empName+" Basic Salary:"+bSal);
	}
	
	public abstract double calcNetSal(int bSal);
	
	
}
