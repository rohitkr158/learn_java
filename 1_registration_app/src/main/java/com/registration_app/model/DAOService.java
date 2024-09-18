package com.registration_app.model;

import java.sql.ResultSet;

//example of abstraction
//I'm developing DAOService in which abstraction(incomplete methods are present)

//b/c plan here what to do it in DB (CRUD operation and login / logout)
public interface DAOService {
	
	public void connectDB();

	public boolean verifyLogin(String email, String password);

	public void addRegistration(String name, String course, String email, String mobile);

	public ResultSet listRegistration();
	
	public void deleteRegistration(String email);

	public void updateRegistration(String mobile, String email); 

	public void logOut();

}
