package com.training.http.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		out.print("Hello " + name);
		out.print("</br>");
		out.print("Your Password is: " + password);
		out.print("</br>");
		HttpSession session = request.getSession();
		
		//Set values to the session
		session.setAttribute("uname", name);
		session.setAttribute("upass", password);
		out.print("<a href='welcome'>view details</a>");
		out.close();

	}
}
