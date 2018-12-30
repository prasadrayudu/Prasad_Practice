package code_30days;

import java.util.Random;

public class RandomGenerator {
	
	

	private static String generateRandom(String aToZ) {
	    Random rand=new Random();
	    StringBuilder res=new StringBuilder();
	    for (int i = 0; i < 17; i++) {
	       int randIndex=rand.nextInt(aToZ.length()); 
	       res.append(aToZ.charAt(randIndex));            
	    }
	    return res.toString();
	}
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		  String aToZ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234"; // 36 letter.
		  String somethingstr=generateRandom(aToZ);

		}

}
