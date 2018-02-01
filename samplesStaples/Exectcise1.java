package samplesStaples;
import java.util.Scanner;

public class Exectcise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String S1,S2;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter two strings");
		
		S1 = S.nextLine();
		// S2 = S.nextLine();
		
//		String X = S1.concat(S2);
//		System.out.println("Concatinated value:  " + X);
		
		int L = S1.length();
		System.out.println(L);
		
		S1 = S1.toUpperCase();
		System.out.println("Converted string is : " + S1);
		
		
	}
	
}
