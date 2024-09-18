package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public firstServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("second");
//		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name"); // it will read name from HTML and stores in the String variable name
		String city = request.getParameter("city");

		// giving name to second servlet which first servlet is reading
		// putting data to request.setAttribute. it will store the name inside request object
		// request object is given to second servlet
		request.setAttribute("name", name);
		request.setAttribute("city", city);

		RequestDispatcher rd = request.getRequestDispatcher("second"); // this wants tp call second servlet
		// rd points to second servlet it is not calling
		// writing code in post servlet will call post method of second servlet
		rd.forward(request, response); // rd.forward will call post method of second servlet and supply request
										// and response and object add. of req. res. will get stored in it

	}

}
