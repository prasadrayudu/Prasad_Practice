package com.interfaceexample;

public class Student implements Info {

	private int studentId;

	public Student(int studentId) {
		this.studentId = studentId;
	}

	public void studentDetails() {
		System.out.println("Student details will be displayed");
	}

	@Override
	public void showInfo() {
		System.out.println("Student Id : " + studentId);

	}

}
