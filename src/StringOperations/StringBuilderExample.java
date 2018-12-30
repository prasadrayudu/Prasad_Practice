package StringOperations;

public class StringBuilderExample {

	public static void main(String args[]) {
		// String str = "prasad";
		// str+= "something";
		//System.out.println(str);
		StringBuilder sb = new StringBuilder("Prasad");

		sb.append(" Rayudu").append(" \t Working in Attra Infotech PvtLtd");
		
		System.out.println(sb.toString());
		// formatting
		System.out.printf("Total cost %d ;quantity is %d",5,120);

	}

}
