package com.telstra.emp;

import taxpack.TaxCalc;

public class Manager extends Employee{
	private String deptName;
	private int empCount;
	
	//constructor chaining super()
	
	public Manager(int empId, String empName, int bSal, String deptName, int empCount) {
		super(empId, empName, bSal);
		this.deptName = deptName;
		this.empCount = empCount;
	}
	
	
	public String getDetails() {
		return (super.getDetails()+" Dept name: "+deptName+" Emp Count:"+empCount);
	}


	public String getDeptName() {
		return deptName;
	}


	public int getEmpCount() {
		return empCount;
	}


	@Override
	public double calcNetSal(int bSal) {
		double pfRate = 0.88;
		
		double tax = TaxCalc.calcTax(this);
		double netSal = (double)bSal*(pfRate)-tax;
		return netSal;
	}
	
	


	
	
	
	
	
	
}
