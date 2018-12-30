package code_30days;

import java.util.Scanner;

public class CoinsFormat {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String s[] = {"coins ","notes"};
		String temp[] = new String[2];
		String inp = "";
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			inp = sc.nextLine();
			temp = inp.split(" ");
			if(temp[0].equalsIgnoreCase("coins")) {
				s[0] = s[0] +"\n"+ temp[1];
			}
			else if(temp[0].equalsIgnoreCase("notes")) {
				s[1] = s[1] +"\n"+ temp[1];
			}
		}
		System.out.println(s[0]);
		System.out.println(s[1]);
	}
	
	
	
	

}