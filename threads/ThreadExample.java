package threads;

class Hi extends Thread
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

class Hello  extends Thread {
	public void run()	
	{
		for (int i=1;i<=5;i++)
		{
		System.out.println("Hello");
		try { Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}


public class ThreadExample {

	public static void main(String[] args) throws Exception {
		Hi hi = new Hi();
		Hello hlo = new Hello();
		
		hi.start();  // this defaults calls run methods. so below run methods are is not required.
		try { Thread.sleep(100);} catch (InterruptedException e) {}
		hlo.start();
		
		//hi.run();		
		//hlo.run();

	}

}
