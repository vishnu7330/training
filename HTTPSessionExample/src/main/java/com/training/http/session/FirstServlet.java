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
		PrintWriter pwriter = response.getWriter();

		String name = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		pwriter.print("Hello " + name);
		pwriter.print("</br>");
		pwriter.print("Your Password is: " + password);
		pwriter.print("</br>");
		HttpSession session = request.getSession();
		
		//Set values to the session
		session.setAttribute("uname", name);
		session.setAttribute("upass", password);
		pwriter.print("<a href='welcome'>view details</a>");
		pwriter.close();

	}
}
