package com.interfaceexample;

public class App {

	public static void main(String[] args) {
	
		Employee emp = new Employee(322027);
		emp.employeeDetails();
	//	emp.showInfo();
		
		Student stu = new Student(113401246);
		stu.studentDetails();
	//	stu.showInfo();
	
		Info info1 = new Employee(322027);
		info1.showInfo();
		
		Info info2 = new Student(113401246);
		info2.showInfo();
	
		
		System.out.println("----------------------");
		
		outputInfo(info1);
		outputInfo(info2);
		
	
	}
	private static void outputInfo(Info info)
	{
		info.showInfo();
	}

}
