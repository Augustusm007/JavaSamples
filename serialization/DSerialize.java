package serialization;

import java.util.List;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			XMLDecoder X = new XMLDecoder(new BufferedInputStream(new FileInputStream("C:\\JT\\StudentList.xml")));
			
			College C = (College)X.readObject();
			X.close();
		    List <Student> S = C.getStudents() ;
		 
		    for (Student value : S) {
		    	System.out.println(value);
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
