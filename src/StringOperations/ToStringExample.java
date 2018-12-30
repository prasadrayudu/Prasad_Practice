package StringOperations;

class Employee{
	
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id +" "+ "name";
	}
	
}


public class ToStringExample {
		
	public static void main(String args[])
	{
		Employee e1=new Employee(101,"Prasad");
		Employee e2=new Employee(102,"Rayudu");
		Object obj = new Object();
		 
		
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}
