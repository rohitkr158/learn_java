package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Do get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println(request.getParameter("name"));
//		System.out.println(request.getParameter("city"));
//		System.out.println(request.getParameter("email"));
//		System.out.println(request.getParameter("mobile"));

		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Connect DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db", "root", "test");
			System.out.println("DB connected");

			// write sql query
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("INSERT INTO registration VALUES ('" + name + "','" + city + "', '" + email + "' , '"
					+ mobile + "')");

			// connection close
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
