package prac2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SecondServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String name = (String)request.getAttribute("name");
//		System.out.println(name);
//		String city = (String) request.getAttribute("city");
//		System.out.println(city);
		
//		HttpSession session = request.getSession();
		String name = (String) request.getAttribute("sessionName");
		String city = (String) request.getAttribute("sessionCity");
		
		System.out.println(name);
		System.out.println(city);
	}

}
