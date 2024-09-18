package app_java_31_database_scanner;

import java.sql.*;
import java.util.Scanner;

public class Create {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in); 
			System.out.println("Enter your name :");
			String name = scan.next();
			
			System.out.println("Enter your city :");
			String city = scan.next();
			
			System.out.println("Enter your email Id :");
			String email = scan.next();
			
			System.out.println("Enter your mobile number :");
			String mobile = scan.next();
			
			//DB connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","test");
			System.out.println("DB connected");
			
			Statement createStatement = con.createStatement();
			createStatement.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
