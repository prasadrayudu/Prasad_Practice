package com.interfaceexample;

public class Employee implements Info {

	private int empid;
	
	
	public Employee(int empid) {
		this.empid = empid;
	}


	public void employeeDetails()
	{
		System.out.println("Employee Details will be displayed.");
	}


	@Override
	public void showInfo() {
		System.out.println("Employee Id  : "+empid);
		
	}
	
}
