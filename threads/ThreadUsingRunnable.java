package threads;

class H implements Runnable
   {
	public void run()
	
	{
		for (int i=1;i<=5;i++)
		{
		System.out.println("Hi");
		try { Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class Ho  implements Runnable {
	public void run()	
	{
		for (int i=1;i<=5;i++)
		{
		System.out.println("Hello");
		try { Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}


public class ThreadUsingRunnable {
	public static void main(String[] args) throws Exception {
		Runnable x = new H();
		Runnable y = new Ho();
		
		
		Thread t1 = new Thread(x);
		Thread t2 = new Thread(y);
		

        t1.start();
		try { Thread.sleep(100);} catch (InterruptedException e) {}
		t2.start();

		
		
	}

}
