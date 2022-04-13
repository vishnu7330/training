package com.training.http.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/welcome")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter pwriter = resp.getWriter();
		HttpSession session = req.getSession(false);

		//Retrieve values from the session
		String myName = (String) session.getAttribute("uname");
		String myPass = (String) session.getAttribute("upass");
		
		pwriter.print("Name: " + myName + "</br>" + " Pass: " + myPass);
		pwriter.close();

	}
}
