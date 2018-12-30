package code_30days;
// 1000 millsec = one sec

class Hii implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
			}	
	}	
}
class Helloo implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
			}	
	}
}
public class MultiTHread_RunnableIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable  obj3 =new Hii();
		Runnable obj4 =new Helloo();
		
		Thread t1 =new Thread(obj3);
		Thread t2 =new Thread(obj4);		
		
		t1.start();
        try {Thread.sleep(500);} catch(Exception e) {}
		t2.start();				

	}
}
