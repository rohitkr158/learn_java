package com.web_app_6_mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_6_mvc.model.AddNumber;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("firstNumber"));
		int num2 = Integer.parseInt(request.getParameter("secondNumber"));
		
		AddNumber a = new AddNumber();
		int result = a.addNumber(num1, num2);
		
		request.setAttribute("res", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("addNumbers.jsp");
		rd.forward(request, response);
		
	}

}
