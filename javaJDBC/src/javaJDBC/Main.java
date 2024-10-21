package javaJDBC;

import java.util.Scanner;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException {
		
 		 Connection con = null;;
		PreparedStatement ps = null;
		String name = "Vasu";
		int rollno = 10;
 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registerd");
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDEMQ\",\"root\",\"man123");
 System.out.println("Connection Established");
 

//ps = con.prepareStatement("INSERT INTO student VALUES('"+name+"','"+rollno+"')");
//int rs = ps.executeUpdate();
 
 ps = con.prepareStatement("SELECT * FROM student", 
		 ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
 
 ResultSet rs = ps.executeQuery();
 rs.afterLast();
 rs.beforeFirst();
 rs.afterLast();
 rs.previous();
 while(rs.previous()) {
	 String sname = rs.getString("name");
	 int sroll = rs.getInt(rollno);
	 System.out.println(sname + "-" + rollno);
 }
 

//while(rs.next()) {
//	String sname = rs.getString("name");
//	int srollno = rs.getInt(rollno);
//}



 
// ps.executeUpdate();
//  int count = ps.executeUpdate();
//  System.out.println(count);
		} 
		catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			ps.close();
			con.close();
		}
	}

}