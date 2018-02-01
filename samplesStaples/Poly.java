package samplesStaples;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show(5);

	}

}

// Method over loading  i.e same method name with diiferent params
class A
{
	public void show()
	{
		System.out.println("This is simple show method");
	}
	
	public void show(int x)
	{
		System.out.println("This is show method with param" + " " + x);
	}

}


// Method overriding

class B extends A {
	public void show(int x)
	{
		System.out.println("This is  B show method with param" + " " + x);
	}
}
