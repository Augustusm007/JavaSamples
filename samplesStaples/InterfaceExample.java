package samplesStaples;

interface Abc {
	
	void show(); // by default it is a  public abstract void show();
}

// Below is prior 1.8
//class AbcImpl implements Abc 
//  {	
//	public void show () 
//	  {
//		System.out.println("This is Interface show");
//	  }
//  }
//
//public class InterfaceExample 
//   {
//	public static void main(String[] args) 
//	   {		
//		Abc obj = new Abc()
//		{
//			public void show ()
//		
//		    {
//			  System.out.println(" This is test Interface");
//		    }
//	   };
//	   obj.show();
//      }  
//   }



// Below code with Java 1.8 using Lambda expresions.

public class InterfaceExample 
   { 
	 public static void main(String[] args) 
       {		
	      Abc obj = () -> System.out.println("This is Interface using Lambda expression");
	      obj.show();
       }
   }