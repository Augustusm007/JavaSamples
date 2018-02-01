package samplesStaples;

//6 mod is == 1,2,3 =>6  is a perfectnum
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		
		boolean b = isPerfect(n);
		if(b)
			System.out.println("Its a Perfect number");
		else
			
			System.out.println("Its NOT a Perfect number");
	}

	public static boolean isPerfect(int n) 
	
	{
		
		int sum=0;
		for (int i=0;i<=n/2;i++){
			if(n%i == 0)
				sum = sum+i;
			
		}
		
		
		if (n==sum)
			return true;
		return false;
	}

	
}
