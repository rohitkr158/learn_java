package app_java_30_finally_block;

import java.sql.*;

public class C {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			System.out.println("DB connected");

			Statement createStatement = con.createStatement();
			createStatement.executeUpdate("insert into registration values('mayank','patna','mayank@gmail.com','9878787784')");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
