package threads;


public class ThreadRunnableUsingLambda {
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread ( () -> 
		  { 
			   for (int i=1;i<=5;i++)
			   {
			    System.out.println("Hi");
			    try { Thread.sleep(500);} catch (InterruptedException e) {}
			   }
		  });
		
		Thread t2 = new Thread (() -> {for (int i=1;i<=5;i++)
			{
			System.out.println("Hello");
			try { Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});
		
		System.out.println (t1.getName());
		System.out.println (t2.getName());
		
        t1.start();
		try { Thread.sleep(100);} catch (InterruptedException e) {}
		t2.start();
		
	
		
		t1.join(); // after thread t1 done, it joins the main thread,so 
		           // that bleow statement can be printed at the end
		t2.join();// after thread t2 done, it joins the main thread.
		System.out.println("Bye");
	}

}
