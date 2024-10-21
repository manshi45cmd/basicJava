package javaJDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstJDBC {
	public static void main(String[] args) throws SQLException {
		
//		Scanner scn = new Scanner(System.in);
//		 String name2 = scn.nextLine();
//		 int rollno2 = scn.nextInt();
//		String name2 = "hh";
//		int rollno2 = 111;
	 
	 
		Connection con = null;;
		PreparedStatement ps = null;
 
		
		try {
//			1. load or register THE Driver
			 Class.forName( "com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver Registerd");
			 
//			 2. establish connection
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDEMQ","root","man123");
			 
			 System.out.println("Connection Established");
			 
//			 3. create statement / PreparedStatement/ CollabaleStatement
// 	  ps = con.prepareStatement(" CREATE TABLE student (name VARCHAR(30), rollno INT)");
		
		  
//		  ========= INSERT =======
//		  ps = con.prepareStatement("INSERT INTO student VALUES (?,?)");
//			 ps = con.prepareStatement("INSERT INTO student VALUES ('Neha',102),('Vishesh',103)");
			 
//			 ps = con.prepareStatement( "INSERT INTO student VALUES( '"+name2+"','"+rollno2+"')");
			 
//			==== DELETE ======
//			 ps = con.prepareStatement(" DELETE  from student WHERE rollno = 103");
			 
//			  ======UPDATE =====
//			 ps = con.prepareStatement(" UPDATE student SET name = 'Diksha' WHERE rollno = 102 ");
			
//      ps = con.prepareStatement("SELECT * from student");
//     ResultSet  rs =  ps.executeQuery();
//			while(rs.next()) {
//				String name1 = rs.getString("name");
//				int rollno1 = rs.getInt("rollno");
			 
			  
//			ps = con.prepareStatement("SELECT * from student", ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//		     ResultSet  rs =  ps.executeQuery();
//					while( ) {
//						String name1 = rs.getString("name");
//						int rollno1 = rs.getInt("rollno");
				
//				System.out.println(name1 + " " + rollno1);
//			}
			 
//			 Statement s = con.createStatement();
//			 int count = s.executeUpdate( "UPDATE  student SET name = 'Sachin' WHERE rollno = 107");
//			 System.out.println("Updated");
			 
//		  ps.setString(1, "GG");
		 
		  
//		 4. execute the query 
//		 ps.executeUpdate();
//		 int count = ps.executeUpdate();
//		 System.out.println(count);
//			 
//			 ps = con.prepareStatement("INSERT INTO student VALUES(?,?)");
//			 ps.setInt(1,  122);
//			 ps.setString(1, "kishan");
//			 ps.addBatch();
//			 
//			 ps.setInt(2,  123);
//			 ps.setString(2, "Ishan");
//			 ps.addBatch();
//			 
//			 int[] count = ps.executeBatch();
//			 for(int i: count) {
//				 System.out.println(i);
//			 }
			 
//			 Statement st = con.createStatement();
//			 con.setAutoCommit(false);
//			 
//			int count1 = st.executeUpdate("INSERT INTO student VALUES('ashvin',1234)");
//			int count2 = st.executeUpdate("INSERT INTO student VALUES('Jadeja',1235)");
//			int count3 = st.executeUpdate("INSERT INTO student VALUES('ashvin',1236)");
//			 
//			 if(count1>0 && count2>0&& count3>0) {
//				 con.commit();
//				 System.out.println("Succefull");
//			 }
//			 else {
//				 con.rollback();
//				 System.out.println("fail");
//			 }
			 
			 con.setAutoCommit(false);
			 ps = con.prepareStatement("INSERT INTO student VALUES(?,?)");
		     ps.setString(101, "varun");
			 ps.setString(222, "Sachin");
		  
			 
			  
		}
		 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
//			ps.close();
			con.close();
		}
	}

}
