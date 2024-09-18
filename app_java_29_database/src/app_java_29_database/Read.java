package app_java_29_database;

import java.sql.*;

public class Read {
	public static void main(String[] args) {
		try {
			// connectDB

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			System.out.println("DB connected " + con);

			// write sql query

			Statement createStatement = con.createStatement();
			ResultSet result = createStatement.executeQuery("select * from registration");
			while (result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}

			// close connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
