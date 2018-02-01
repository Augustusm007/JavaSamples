package samplesStaples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class WriteReadpropertyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Properties P = new Properties();
		// write to file
//		OutputStream os = new FileOutputStream("C:\\JT\\JavaSamplesStaples\\dbjava.properties");
//		
//		P.setProperty("Host", "localhost");
//		P.setProperty("User", "test");
//		P.setProperty("Pwd", "****");
//		
//		P.store(os,null);
		
		// read property file
		
		InputStream is = new FileInputStream("C:\\JT\\JavaSamplesStaples\\dbjava.properties");
		P.load(is);
		
		//System.out.println(P.getProperty("Host"));
		P.list(System.out);
	}

}
