<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "portal";
String userid = "root";
String password = "@database4ME";
try {
	Class.forName(driver);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Best Engineering College</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>
	<div class="container">
		<div class="navigation">
			<ul>
				<li><a href="departments.jsp">Departments</a></li>
				<li><a href="examinations.jsp">Examinations</a></li>
				<li><a href="results.jsp">Results</a></li>
			</ul>
		</div>
		<div class="main">
			<div class="banner">
				<h2>Best Engineering College</h2>
			</div>
			<div class="departments">
				<h2>Departments</h2>
				<table>
					<thead class="departmentheader">
						<tr>
							<td>S. No</td>
							<td>Unique Id</td>
							<td>Name</td>
						</tr>
					</thead>
					<tbody>
						<%
						try {
							connection = DriverManager.getConnection(connectionUrl + database, userid, password);
							statement = connection.createStatement();
							String sql = "select * from departments";
							resultSet = statement.executeQuery(sql);
							int i = 1;
							while (resultSet.next()) {
								System.out.println(" i = " + i);
						%>
						<tr>
							<td><%=i++%></td>
							<td><%=resultSet.getString("id")%></td>
							<td><%=resultSet.getString("name")%></td>

						</tr>
						<%
						}
						connection.close();
						} catch (Exception e) {
						e.printStackTrace();
						}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>