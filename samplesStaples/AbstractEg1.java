package samplesStaples;


abstract class shape{
	
	public void move(int x,int y){
		
		System.out.println( "This is moved" + " x = " + x + "y =  " + y);
		
	}
	
	
	abstract public void draw();
	abstract public void area();
	
}


class rectangle extends shape {
	
	
	int l ,b ;
	
	
	public rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	public void draw (){
		 System.out.println("Rectangle has drawn");
	}
	
	public void area() {
		
		System.out.println("Area of rectangle is : " + l*b);
	}
}

public class AbstractEg1 {

	public static void main(String[] args) {

		shape rec = new rectangle(2,4 );
	   rec.draw();
	   rec.area();

}
}