<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Implicit Objects</title>
</head>
<body>
	<!-- Implicit Object: out -->
	<% out.print("Today is:   "+java.util.Calendar.getInstance().getTime()); %>

	<br>
	<!-- Implicit Object: session -->
	<% session.setAttribute("user","testUser"); %>
	<% out.print("Session accessed time:   " + session.getLastAccessedTime()); %>
	<br>
</body>
</html>