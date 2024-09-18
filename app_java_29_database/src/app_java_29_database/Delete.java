package app_java_29_database;

import java.sql.*;

public class Delete {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			System.out.println("DB connected " + con);
			
			
			Statement createStatement = con.createStatement();
			createStatement.executeUpdate("delete from registration where email = 'shruti@gmail.com'");
			
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
