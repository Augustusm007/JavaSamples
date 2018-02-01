package samplesStaples;

public class InherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddSub obj = new AddSub();
	    obj.a = 5;
	    obj.b = 2;
	    obj.substract();
	    obj.sum();
	    
	    System.out.println(obj.resultA);
	    System.out.println(obj.resultB);
	    
	}

}

class Add {
	
	int a,b;
	int resultA,resultB;
	
	public void sum(){
		resultA = a+b;
		
	}
}

class AddSub extends Add
 {
	public void substract(){
	resultB = a-b;
		
	}
}