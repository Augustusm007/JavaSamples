package samplesStaples;

import java.util.HashSet;
import java.util.Set;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] myList = new int[10];
		
		int[] myList = {1,2,3,4,5,6,1};
		for (int i=0;i<myList.length;i++)
		{
			System.out.print(myList[i] + " ");
		}
		
		//sum all elements
		int Total = 0;
		for (int i=0;i<myList.length;i++)
		{
			Total += myList[i];
						
		}
		System.out.println(Total);

	
	// Print largest element
		int max =0;
	for (int i=0;i<myList.length;i++)
	{
		if ( myList[i] > max)  max = myList[i];
		  
	}
	System.out.println("Max is :" + max);
	
	//PrintDuplicates from arraylist
	Set<Integer> HS = new HashSet<>();
		
	for (int X:myList)
	{
		
		if (HS.add(X) == false) 
			System.out.println(X);
		
		  
	}
 }
}
