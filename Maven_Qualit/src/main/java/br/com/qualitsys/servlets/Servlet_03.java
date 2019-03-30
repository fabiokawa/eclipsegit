package br.com.qualitsys.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_03
 */
@WebServlet("/Servlet_03")
public class Servlet_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_03() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String Titulo = "Hands-ON - Servlets JSP - Laboratório 03";
		out.println(
		 "<HTML>\n" +
		 "<HEAD><TITLE>" + Titulo + "</TITLE></HEAD>\n" +
		 "<BODY BGCOLOR=\"#6699FF\">\n" +
		 "<H1 ALIGN=CENTER>" + Titulo + "</H1>\n" +
		 "<OL>" + "<HR SIZE=4 WIDTH=50%>" +
		 "<H2 ALIGN=CENTER>" +
		 "Servlet_03" + "</H2>\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
