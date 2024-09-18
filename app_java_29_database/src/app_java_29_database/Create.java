package app_java_29_database;

import java.sql.*;

public class Create {
	public static void main(String[] args) {
		try {
			// Connect DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			System.out.println("DB connected");

			//write sql query
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("INSERT INTO registration VALUES ('shruti', 'jabalpur', 'shruti@gmail.com', '8983456656')");
			
			//connection close
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
