package code_30days;

public class RunnableEx {

	public static void main(String[] args) {
		
	Runnable  obj3 =new Runnable()
	{
	   public void run()
	    {
		for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(1000);	} catch (Exception e) {}}	
	     }
	};	
	
	Runnable obj4 =new Runnable()
	{
		   public void run()
		    {
			for(int i=1;i<=5;i++)
				{
					System.out.println("Hi");
					try {Thread.sleep(1000);	} catch (Exception e) {}}	
		     }
		};
	
	Thread t1 =new Thread(obj3);
	Thread t2 =new Thread(obj4);
	t1.start();
	t2.start();
   }
}