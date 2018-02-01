package jdbc;

//1.Import pkg java.sql.*
//2.Load & Register the drivers
//3.Establish a connection
//4.create a statement/prepared statement
//5.execute the query
//6.process result set
//7.close the connection

import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) throws Exception
	{		
		String url = "jdbc.sql://localhost:3380/test";
		String user="test";
		String pwd="";
		String query = "select empname from employee";
	//2.
     Class.forName("com.mysql.jdbc.Driver");
    //3
     Connection con = DriverManager.getConnection(url, user, pwd);
    //4
     Statement st = con.createStatement();
    //5
     ResultSet rs = st.executeQuery(query);
     
     rs.next();
    //6 
     String name = rs.getString("EmpName");
     System.out.println(name);
     //7
     st.close();
     con.close();
	}

}
