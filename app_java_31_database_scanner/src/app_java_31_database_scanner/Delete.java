package app_java_31_database_scanner;

import java.sql.*;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter you email id :");
			String email = scan.next();

			// DB connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			System.out.println("DB connected");

			Statement createStatement  = con.createStatement();
			createStatement.executeUpdate("delete from registration where email = ('" + email + "')");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
