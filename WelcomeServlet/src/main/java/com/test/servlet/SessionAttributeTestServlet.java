package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SessionAttributeTestServlet", description = "Servlet with Annotation", urlPatterns = {
		"/SessionAttributeTestServlet" })
public class SessionAttributeTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String attributeName = "SessionAttribute";
		String attributeValue = "Initial Value";
		session.setAttribute(attributeName, attributeValue);
		attributeValue = "New Value";
		session.setAttribute(attributeName, attributeValue);
		session.removeAttribute(attributeName);
		
		response.setContentType("text/html");//setting the content type  
		PrintWriter pw=response.getWriter();//get the stream to write the data  
		  
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Listeners supposed to be invoked");  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream  
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}