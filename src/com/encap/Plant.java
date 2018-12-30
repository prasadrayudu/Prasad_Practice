package com.encap;

class Details {
	
	public static final int ID = 7;
	
	private String name;
	private int age;
	
	
	
	public Details(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
/*	public void setName(String name) {
		this.name = name;
	}*/
	public int getAge() {
		return age;
	}
	/*public void setAge(int age) {
		this.age = age;
	}*/
	public void calculatedGrowthForecast()
	{
		System.out.println("Show something...");
	}
	
	/*public String getData()
	{
		String data = "Tree is made of " + calculatedGrowthForecast();
		return data;
	}*/
	
	
}


public class Plant {

	public static void main(String[] args) {
		
		Details dt = new Details("prasad",20);
		
		System.out.println(dt.getAge());
		System.out.println(dt.getName());
		
	}

}
