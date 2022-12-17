<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="datasource" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/portal" user="root"
	password="@database4ME" />

<sql:query var="departments" dataSource="${datasource}">
        SELECT * FROM departments;
</sql:query>

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
						int i = 1;
						%>
						<c:forEach var="department" items="${departments.rows}">
							<tr>
								<td><%=i%></td>
								<td><c:out value="${department.id}" /></td>
								<td><c:out value="${department.name}" /></td>
							</tr>
							<%
							i++;
							%>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>