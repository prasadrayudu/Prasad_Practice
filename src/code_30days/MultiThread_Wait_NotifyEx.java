package code_30days;

class Q{
	int num;
	boolean setValue =false;
	
	public synchronized void put(int num) {
		while(setValue)
		{
			try { wait(); } catch(Exception e) {}
		}
		System.out.println("Put :" + num);
		this.num=num;
		setValue = true;
		notify();
		
			}
	public synchronized void  get()
	{
		while(!setValue)
		{
			try { wait(); } catch(Exception e) {}
		}
		System.out.println("Get :" + num);
		setValue = false;
		notify();
	}
}
class Producer implements Runnable
{
	Q q;
		public Producer(Q q) {
		super();
		this.q = q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			
			try { Thread.sleep(1000); } catch(Exception e) {} 
		}
	}
	
}
class Consumer implements Runnable
{
	Q q;
	
	public Consumer(Q q) {
		
		this.q = q;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.get();
			
			try { Thread.sleep(1000); } catch(Exception e) {} 
		}
	}
	
}public class MultiThread_Wait_NotifyEx {

	public static void main(String[] args) {
	
		Q q =new Q();
		new Consumer(q);
		new Producer(q);
		
	}

}
