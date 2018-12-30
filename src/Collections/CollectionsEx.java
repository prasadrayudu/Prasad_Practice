package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsEx {

	public static void main(String[] args) {

		
	/*	Collection c= new ArrayList();
		c.add(5);
		c.add(5);
		c.add(5.5);
		c.add("prasad");
		c.add(8);
		c.add("293r0");
		c.remove(6);
		
	  for(Object o :c)
	  {
		  System.out.println(o);
	  }
		*/
		Collection<Integer>  i= new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.remove(2);
		
		for (Integer o:i)
		{
			System.out.println(i);
		}
		/*	
		Collection<String>  i= new ArrayList<>();
		i.add("Prasad");
		i.add("Rayudu");
		for (Object o:i)
		{
			System.out.println(i);
		}
		
	*/
	}

}
