package br.com.qualitsys.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Servlet_04
 */
@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int[] tab_numeros = new int[10];

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_04() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		for(int i=0; i < tab_numeros.length; i++)
			tab_numeros[i] = i;
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String Titulo = "Hands-on - Servlets JSP - Laboratório 04";
		out.println(
				"<HTML>" +
						"<HEAD><TITLE>" + Titulo + "</TITLE></HEAD>" +
						"<BODY BGCOLOR=\"#6699FF\">" +
						"<H1 ALIGN=CENTER>" + Titulo + "</H1>" +
						"<OL>" + "<HR SIZE=4 WIDTH=50%>" +
						"<H2 ALIGN=CENTER>" +
						"Servlet_04" + "</H2>\n" +
				"</BODY></HTML>");
		for (int i=0; i<tab_numeros.length; i++)
			out.println( "<H1 ALIGN=CENTER>" + tab_numeros[i] + "</H1>\n" );
		out.println("</OL>" + "</BODY></HTML>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}