<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

	<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>
	<br>
	Name : 
	<%= request.getParameter("name") %>
	
	<h2>Beans in JSP</h2>
	
	
	<jsp:useBean id="test" class="com.training.jsp.TestBean" />
	
	<jsp:setProperty name="test" property="message" value="Hello JSP..." />
	<p>Got message....</p>
	<jsp:getProperty name="test" property="message" />

</body>
</html>