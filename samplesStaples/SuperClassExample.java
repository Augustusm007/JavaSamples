package samplesStaples;

public class SuperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D obj = new D();
		obj.show();

	}

}

class C
{
	public void show()
	{
		System.out.println( " This is from C class");
	}
}


class D extends C
{
	
	public void show()
	{
		super.show();  // this will print from parent class
		System.out.println( " This is from D class");
	}
}