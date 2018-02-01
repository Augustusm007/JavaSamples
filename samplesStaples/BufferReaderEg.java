package samplesStaples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEg {
          
	public static void main(String[] args) throws Exception 
	 {
//		BufferedReader BR = null;
//		String str = "";
//		 BR = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			str = BR.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally
//		{
//			try {
//				BR.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		// *** in 1.7 new feature introduced. No need to add catch/finally block.
		
		try ( BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)))
		{
			BR.readLine();
		}

	}

}
