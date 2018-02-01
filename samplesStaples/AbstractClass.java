package samplesStaples;

public class AbstractClass {

	public static void main(String[] args) {
		
		//MaheshPhone Obj = new MaheshPhone(); // this can't be done due to abstract class
		
		MaheshPhone obj = new SureshPhone();
		
	    obj.call();
	    obj.cook();
	    obj.dance();
	    obj.move();
		
        
	}

}

abstract class MaheshPhone  //abstract class

{
    public void call ()     //define the implemantation
    {
    	System.out.println("Calling ...");
    }
    
   abstract public void dance();  // decalre the methods
   abstract public void cook();
   abstract public void move();
    
}


abstract class RameshPhone extends MaheshPhone  //abstract class
{
	
	public void dance()
	{
		System.out.println("Dancing ...");
	}
	
//	   abstract public void cook();
//	   abstract public void move();
}

class SureshPhone extends RameshPhone   // THIS IS CALLED CONCRETE class AS all features are implemented
{
	 public void cook()
	 {
		 System.out.println("Cooking ...");
	 }
	 
	 public void move()
	 {
		 System.out.println("Moving ... ");
	 }
}