package javapractice.ee.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ParamServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();
		writer.append("Servlet   : ").append(request.getContextPath());
		writer.append("Session ID: ").append(session.getId());
		writer.append("<h3>Hello from the doGet()</h3>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.append("Served at: ").append(request.getContextPath());
		String fullname = request.getParameter("fullname");
		String user = request.getParameter("name");
		String profession = request.getParameter("profession");
		String[] location = request.getParameterValues("location");
		writer.append("<h3>Hello, " + user + ", from the doPost()</h3>");
		writer.append("Full Name: " + fullname + "<br>");
		writer.append("You are a professional " + profession + " living in " + Arrays.toString(location));
	}

}
