package samplesStaples;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
				X obj = new X();
			    obj.i =5;
			    obj.j =6;
			    
			    //Deep Copy
//			    X obj1 = new X();
//			    obj1.i = obj.i;
//			    obj1.j = obj.j;
	    
			    //Cloning is combination of Shallowcopy + Deepcopy
			    X obj1 = (X)obj.clone(); 
			    System.out.println(obj); //5 6
			    System.out.println(obj1);// 5,6
		
	}


}
	

class X implements Cloneable {
	int i,j;

	@Override
	public String toString() {
		return "X [i=" + i + ", j=" + j + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

