package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		PrintWriter out  = resp.getWriter();
		out.println("Hello "+ name+ " -> from servlet1.");
		
		RequestDispatcher rd = req.getRequestDispatcher("callingServlet2");
		rd.include(req, resp);
		// rd.forward(req, resp); This forward method is ignore the printing statement thats you i'm using the  include.
		

	}

}
