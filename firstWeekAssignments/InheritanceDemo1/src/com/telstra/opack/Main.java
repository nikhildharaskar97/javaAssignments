package com.telstra.opack;

import com.telstra.emp.Employee;
import com.telstra.emp.Manager;
import com.telstra.emp.Programmer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Manager m1 = new Manager(200,"Shreya",70000,"HR",10);
		
		System.out.println(m1.getDetails());
		
		Employee emp = new Manager(201,"Nikhil",70000,"IT",5);
		System.out.println(emp.getDetails()); 
		
		Manager m10 = (Manager)emp;
		
		Employee[] emparr = new Employee[4];
		
		
		emparr[1] = new Manager(200,"abc",70000,"RD",15);
		emparr[2] = new Manager(203,"def",70000,"NM",15);
		emparr[3] = new Programmer(101,"xyz",60000,10,"Java");		
		System.out.println("Details");
		for (Employee em : emparr) {
			System.out.println(em.getDetails());
		}
		
		

	}

}
