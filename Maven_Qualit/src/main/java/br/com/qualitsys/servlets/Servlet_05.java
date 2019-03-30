package br.com.qualitsys.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Servlet_05
 */
@WebServlet(
		urlPatterns = { "/Servlet_05" },
		initParams = {
				@WebInitParam(name = "PARAM1", value = "QUALITSYS"),
				@WebInitParam(name = "PARAM2", value = "5")
		})
public class Servlet_05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String param1;
	private static String param2;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_05() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("INIT EXECUTADO....");
		//super.init(config);
		param1 = config.getInitParameter("PARAM1");
		param2 = config.getInitParameter("PARAM2");
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body><h2>PARAM1 = " + param1 + "</h2>");
		out.print("<h2>PARAM2 = " + param2 + "</h2></body>");
		out.print("</html>");

		System.out.println("doGet executado.....");

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
