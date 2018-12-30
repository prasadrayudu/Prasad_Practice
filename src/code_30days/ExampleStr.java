package code_30days;

public class ExampleStr {

public static void main(String[] args) {
	

Student s1 = new Student(12, "werw");


	System.out.println(s1.rollno);
	System.out.println(s1.sname);

	
}
class Student {
	
	 int rollno;
	 String sname;
	public Student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}
	 

/*
	@Override
	public String toString()
	{
		return rollno + sname; 
	}
	*/
}

}
	
	

