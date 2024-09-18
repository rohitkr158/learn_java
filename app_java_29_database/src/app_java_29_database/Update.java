package app_java_29_database;

import java.sql.*;

public class Update {
	public static void main(String[] args) {
		try {
			//connect DB
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
			System.out.println("DB connected " + con);
			
			
			//write sql query
			Statement createStatement = con.createStatement();
			createStatement.executeUpdate("update registration set mobile = '6206354675' where name = 'navneet'");
			
			
			//close connection
			con.close();
			
		} catch (Exception e) {

		}
	}
}
