<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h2>this is index page</h2>

	<jsp:forward page="beans.jsp">
		<jsp:param name="name" value="Test User" />
	</jsp:forward>

	<!-- jsp:useBean in printdate.jsp -->

</body>
</html>

<!-- Types of JSP Action tags -->

<!-- 	jsp:forward
		jsp:include
		jsp:useBean
		jsp:setProperty
		jsp:getProperty
		jsp:plugin
		jsp:param
		jsp:fallback
	 -->