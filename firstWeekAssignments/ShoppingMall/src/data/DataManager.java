package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataManager {
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telstra_database","root","Vishal01v&d");  
	
	private static Connection con = null;
	
	public static Connection getConnection() {
		 try {
			 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telstra_database","root","Vishal01v&d");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return con;
	}
	
	
	
	
}
