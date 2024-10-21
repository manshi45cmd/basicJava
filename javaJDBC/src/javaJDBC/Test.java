package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Rejesterd");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDEMQ","root","man123");
			 
			 System.out.println("Connection Established");
			 
 			 ps = con.prepareStatement("CREATE TABLE Employee (eid INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(25),address VARCHAR(30), salary INT");
//			 ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
//			 
//			 ps.setString(1, "priya");
//			 ps.setString(1, "Kolkata");
//			 ps.setInt(1, 3000);
			 
//			C:\Users\Hp\Downloads
			 ps.executeUpdate();
			 int count = ps.executeUpdate();
			 System.out.println(count);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			ps.close();
			con.close();
		}
	}

}
