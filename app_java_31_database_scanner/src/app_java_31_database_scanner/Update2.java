package app_java_31_database_scanner;

import java.sql.*;
import java.util.Scanner;

public class Update2 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the email id whose data you want to change :");
			String email = scan.next();

			System.out.println("Enter new name :");
			String name = scan.next();

			System.out.println("Enter new city :");
			String city = scan.next();

			System.out.println("set new number :");
			String mobile = scan.next();

			// connect DB

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			System.out.println("DB connected " + con);

			// write sql query
			Statement createStatement = con.createStatement();
			createStatement.executeUpdate("UPDATE registration SET name = '" + name + "',  city = '" + city + "',  mobile =  '" + mobile + "' WHERE email = '" + email + "'");

			// close connection
			con.close();

		} catch (Exception e) {

		}
	}
}
