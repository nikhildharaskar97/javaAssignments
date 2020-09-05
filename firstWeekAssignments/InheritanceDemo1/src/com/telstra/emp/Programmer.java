package com.telstra.emp;

import taxpack.TaxCalc;

public class Programmer extends Employee {
	private int noOfProjects;
	private String skillSet;
	public Programmer(int empId, String empName, int bSal, int noOfProjects, String skillSet) {
		super(empId, empName, bSal);
		this.noOfProjects = noOfProjects;
		this.skillSet = skillSet;
	}
	
	
	public String getDetails() {
		return (super.getDetails()+" No of projects:"+ noOfProjects+" Skill set: "+skillSet);
	}
	
	@Override
	public double calcNetSal(int bSal) {
		double pfRate = 0.88;
		
		double tax = TaxCalc.calcTax(this);
		double netSal = (double)bSal*(pfRate)-tax;
		return netSal;
	}
	
	
}
