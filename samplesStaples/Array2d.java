package samplesStaples;

public class Array2d {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		int[] c = {9,0,3,4};
        
		 int p[][] = { 	 {1,2,3,4},
				         {5,6,7,8},
				         {9,0,3,4} 	 };
		 
//		 for (int i =0 ;i<3;i++){
//			 for (int j=0;j<4;j++) {
//				 System.out.print(p[i][j] + " ");
//			 }
//			 System.out.println("");
//		 }
		 
		 
		 for (int []i :p) {
			 for (int j :i)
			 {
			 System.out.print(j + " ");
			 }
			 System.out.println("");
		 }
		 
	}

}

