package com.generics;

import java.util.ArrayList;
class Machine {
	
}
class Camera extends Machine {
	
}
public class genericExample {
	
	public static void main(String args[])
	{
		
	ArrayList<Integer> list = new ArrayList<>();
	list.add(3);
	list.add(4);
	showList(list);
	
	}
	public static void showList(ArrayList<Integer> list) {
		
			for(int value : list)
			{
				System.out.println(value);
			}
			
		}
}
