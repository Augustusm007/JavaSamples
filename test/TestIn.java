package test;

class T1 implements Runnable {

	public void run(){
		for (int i=0;i<=5;i++){
			System.out.println("This is T1 Class");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class T2 implements Runnable {

	public void run(){
		for (int i=0;i<=5;i++){
			System.out.println("This is T2 Class");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}


public class TestIn {

	public static void main(String[] args) {
		Runnable X = new T1();
		Runnable Y = new T2();
		
         Thread objt1 = new Thread (X);
         Thread objt2 = new Thread (Y);
         
         objt1.start();
         try {Thread.sleep(100);} catch (InterruptedException e) {}
         objt2.start();
	}

}
