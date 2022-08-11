package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "WelcomeServlet", description = "Servlet with Annotation", urlPatterns = { "/Welcome",
		"/HelloWorld" })
public class WelcomeServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("init method called");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Get method of Welcome Servlet");
		response.setContentType("text/html");// setting the content type
		PrintWriter out = response.getWriter();// get the stream to write the data

		// writing html in the stream
		out.println("<html><body>");
		out.println("Welcome to servlet " + req.getParameter("username"));
		out.println("</body></html>");
		
		Cookie ck=new Cookie("user","testUser");//creating cookie object  
		response.addCookie(ck);//adding cookie in the response  
		
		//delete cookie example
//		Cookie ck=new Cookie("user","");//deleting value of cookie  
//		ck.setMaxAge(0);//changing the maximum age to 0 seconds  
//		response.addCookie(ck);//adding cookie in the response  

		out.close();// closing the stream
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Post method of Welcome Servlet");

		response.setContentType("text/html");// setting the content type
		PrintWriter pw = response.getWriter();// get the stream to write the data

		// writing html in the stream
		pw.println("<html><body>");
		pw.println("Post method of Welcome servlet");
		pw.println("</body></html>");

//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("forward");

		// ********* INCLUDE **********
//		requestDispatcher.include(request, response);

		// ********* FORWARD **********
//		requestDispatcher.forward(request, response);

		// ********* SEND-REDIRECT **********
//		response.sendRedirect("https://www.google.com/");

		pw.close();// closing the stream
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method called");
	}
}