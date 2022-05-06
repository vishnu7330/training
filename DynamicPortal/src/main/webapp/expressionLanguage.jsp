<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
String title = "Expression Language (EL) Example";
%>

<html>
<head>
<title>
	<%
	out.print(title);
	%>
</title>
</head>

<body>
	<div align="center">
		<h1>
			<%
			out.print(title);
			%>
		</h1>
	</div>

	<!-- EL accessing Box object properties -->
	<div align="center">
		<jsp:useBean id="box" class="com.training.jsp.Box" />

		<jsp:setProperty name="box" property="width" value="10" />
		<jsp:setProperty name="box" property="length" value="20" />

		<p>
			Box details.... <br>
			Length : ${box.length}
			<br> 
			Width : ${box.width}
			<br>
			Area : ${box.length * box.width}
		</p>
	</div>

	<!-- EL accessing HTTP request header object properties -->
	<div align="center">
		<h2> HTTP Request header information</h2>
		<p>${header["Sec-CH-UA-Platform"]}</p>
		<p>${header["Sec-CH-UA"]}</p>
	</div>
	<!-- EL accessing HTTP request parameter properties -->
	<div align="center">
		<h2> HTTP Request parameter</h2>
		<p>${param["name"]}</p>
	</div>
</body>
</html>