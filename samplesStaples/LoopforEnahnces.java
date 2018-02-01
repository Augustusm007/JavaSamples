package samplesStaples;

public class LoopforEnahnces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = new int[5];
		
		//for (int i =0;i<myList.length;i++) {
		 //   System.out.println("Element: " + i);
	
		for (int i : myList) {
			i = myList[i] +1; 
		    System.out.println("Element: " + i);
		    
		}
		}
		
	}



