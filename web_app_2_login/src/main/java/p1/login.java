package p1;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/verifyLogin")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db", "root", "test");
			System.out.println("DB connected");

			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery(
					"select * from login where email = '" + email + "' and password = '" + password + "'");
//			System.out.println(result.next());
			if (result.next()) {
				System.out.println("welcome");
			} else {
				System.out.println("invalid email/password");
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
