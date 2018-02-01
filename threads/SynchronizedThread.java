package threads;


class  counter {
	int c;
	  public synchronized void increment() {  //synchronized method will wait until t1 thread counter completes 
		                            // meaning only one thread can work with this method.
		  c++;
	  }
	
}
public class SynchronizedThread {

	public static void main(String[] args) throws InterruptedException {
	
		 counter x = new counter();
		 Thread t1 = new Thread (new Runnable()
		 {
			 public void run(){
				 for (int i=1;i<=1000;i++)
				 {
					 x.increment();
				 }
			  }
		 });
		 
		 Thread t2 = new Thread (new Runnable()
		 {
			 public void run(){
				 for (int i=1;i<=1000;i++)
				 {
					 x.increment();
				 }
			  }
		 });
		 
		 t1.start();
		 t2.start();
		 t1.join();
		 t2.join();
		System.out.println(x.c);
     
	}

}
