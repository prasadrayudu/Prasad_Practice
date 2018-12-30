package code_30days;

import java.util.Scanner;
import java.util.*;


public class Datatype_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i = 4;
	        double d = 4.0;
	        String st1 = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        double b = scan.nextDouble();
	        scan.nextLine();
	        String st2 = scan.nextLine();
	        
	          System.out.println((i+a));
	          System.out.println((d+b));
	          System.out.println(st1+ "" +st2);
	          scan.close();
	          
	 /*   Scanner s1 = new Scanner(System.in);
	    System.out.println("Enter your name");
	    String w = s1.next();
	    System.out.println("Your name is " + w);
	    System.out.println("Again enter your name");
	    String st = s1.nextLine();
	    System.out.println("Your name is " + st);	
*/
	}

}
