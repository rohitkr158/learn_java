package com.registration_app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//inheriting incomplete methods and doing polymorphism (overriding) that  method and doing abstraction 
//by developing interface

public class DAOServiceImpl implements DAOService {
	Statement stmnt;

	@Override
	public void connectDB() {
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration_app", "root", "test");
	            System.out.println("DB connected");
	            stmnt = con.createStatement();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery(
					  "SELECT * FROM login WHERE email = '" + email + "' AND password = '" + password + "'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void addRegistration(String name, String course, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values('" + name + "','" + course + "','" + email + "','"
					+ mobile + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet listRegistration() {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteRegistration(String email) {
		try {
			stmnt.executeUpdate("delete from registration where email ='" + email + "' ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateRegistration(String mobile , String email) {
		try {
			stmnt.executeUpdate("update registration SET mobile ='"+mobile+"' where email = '"+email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void logOut() {

	}

}
