package samplesStaples;

public class MethodOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b=20;
		double d = 10.5,e = 20.5;
		
		int resultInt= minFunction(a,b);
		double resultdub= minFunction(d,e);
		
		System.out.println("Minmun Int is :" + resultInt );
		System.out.println("Minmun double is :" + resultdub );

	}
	
	public static int minFunction(int a,int b){
		int min;
		if (a<b)
			min =a;
			else min = b;
		
		return min;
		
	}
	
	public static double minFunction(double a,double b){
		double min;
		if (a<b)
			min =a;
			else min = b;
		
		return min;
		
	}

}
