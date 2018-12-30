package code_30days;

import java.util.ArrayList;
import java.util.Scanner;
public class CoinsNotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for random coins and notes :");
		int N = sc.nextInt();
		System.out.println("Enter the random coins and notes");
		ArrayList <String> coins=new ArrayList<>();
		ArrayList <String> notes=new ArrayList<>();
		for(int i=0;i<=N;i++)
		{
			String EnteredValue=" ";
			EnteredValue=sc.nextLine();
			if(EnteredValue.contains("coins"))
			{
				coins.add(EnteredValue);		
			}else if(EnteredValue.contains("notes"))
			{
				
				notes.add(EnteredValue);
			}
		}
		System.out.println("Coins : ");
		for(String str:coins) {
			System.out.println(str.split(" ")[1]);
		}
		System.out.println("Notes : ");
		for(String str2:notes)
		{
			System.out.println(str2.split(" ")[1]);
		}
		sc.close();
	}

}
