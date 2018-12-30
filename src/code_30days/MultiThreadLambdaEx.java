package code_30days;

public class MultiThreadLambdaEx {

	public static void main(String[] args) throws Exception {
		
		Thread t1 =new Thread(() ->
		{
			for(int i=1;i<=2;i++)
				{
					System.out.println("Hi");
					try {Thread.sleep(1000);} catch (Exception e) {}}
				});
		Thread t2 =new Thread(() ->
		{
			for(int i=1;i<=2;i++)
				{
					System.out.println("Hello");
					try {Thread.sleep(1000);} catch (Exception e) {}}
				});
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(3);
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());	

		System.out.println("Bye");
		
	
	}

}
