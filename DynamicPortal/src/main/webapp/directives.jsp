<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- import attribute of **** @page directive *** -->
<%@ page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP directives</title>
</head>
<body>

	<!-- *** @include directive **** -->
	<%@ include file="header.html"%>

	Today is:
	<%= new Date() %>
</body>
</html>