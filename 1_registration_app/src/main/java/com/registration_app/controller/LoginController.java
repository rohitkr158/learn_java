package com.registration_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registration_app.model.DAOServiceImpl;

@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String email = request.getParameter("email"); // controller is reading data from the view
			String password = request.getParameter("password"); // take this data give it to model

			// database should be in model component
			// calling model
			DAOServiceImpl service = new DAOServiceImpl();

			// calling connectDB()
			service.connectDB();

			// calling verifyLogin()
			boolean status = service.verifyLogin(email, password);
//			System.out.println(status);

			if (status) {
//				System.out.println("welcome");

				// Creating session

				// when status is true create session variable means email pass was valid
				// stating that login has happened and the session will hold info. about the
				// user
				// session variable will have info. of about 100 of people at a single time
				HttpSession session = request.getSession(true); // setting true b/c when creating session 1st time set
																// it to
																// true but when using existing session set to false
				session.setMaxInactiveInterval(60);
				session.setAttribute("email", email);

				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/add_registration.jsp");
				rd.forward(request, response);
			} else {
//				System.out.println("Invalid email/password");
				request.setAttribute("error", "Invalid email/password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}

		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}

	}

}



