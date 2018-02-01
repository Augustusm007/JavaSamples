package samplesStaples;

//1 1 2 3 5 8 12 .....50

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1,b=1,c=0;
		System.out.print("1 1 ");
		
		while (c <=50) {
			
			c = a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}

}
