package app_java_31_database_scanner;

import java.sql.*;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in); 
			
			System.out.println("set mobile number :");
			String mobile = scan.next();
			
			System.out.println("Enter your email id :");
			String email = scan.next();
			//connect DB
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
			System.out.println("DB connected " + con);
			
			
			//write sql query
			Statement createStatement = con.createStatement();
			createStatement.executeUpdate("UPDATE registration SET mobile = '"+mobile+"' WHERE email = '"+email+"'");
			
			
			//close connection
			con.close();
			
		} catch (Exception e) {

		}
	}
}
