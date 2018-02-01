package serialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student();
		S1.setRollno(101);
		S1.setSname("Tom");
					
		Student S2 = new Student();
		S2.setRollno(102);
		S2.setSname("Jack");
		
		List <Student> S3 = new ArrayList<>() ;
		
		S3.add(S1);
		S3.add(S2);
		
		// assign student list to college
		College C =new College ();
		C.setStudents(S3);
		
		try {
			XMLEncoder X = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("C:\\JT\\StudentList.xml")));
			
			X.writeObject(C);
			X.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
}
}