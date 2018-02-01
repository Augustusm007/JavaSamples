package samplesStaples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteToFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	   File f = new File("C:\\JT\\JavaSamplesStaples\\Test.txt");
		
	   //write text to a file
	   FileOutputStream fos = new FileOutputStream(f);
       DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("This is java write file eg");
		
		// read file and print
		
		FileInputStream fis = new FileInputStream (f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
}
}
