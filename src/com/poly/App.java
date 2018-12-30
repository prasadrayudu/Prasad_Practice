package com.poly;

public class App {

	public static void main(String[] args) {
	
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
/*		Plant plant2 = tree;
		plant2.grow();
*/		
		plant1.grow();
		tree.grow();
	System.out.println("-------------------");
	
	    doGrow(tree);
	    doGrow(plant1);
		
	}
	
	public static void doGrow(Plant x)
	{
		x.grow();
	}

}
