<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Best Engineering College</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>
<div class="login">
	<div class="loginheading">
		<h2>Best Engineering College</h2>
	</div>

	<div class="loginform">
		<div class="loginformdetails">
			<form action="j_security_check" method=post>
				<p class="username">
					<strong>User Name: </strong> <input type="text"
						name="j_username" size="25">
				</p>
				<p class="password">
					<strong>Password:  </strong> <input type="password"
						size="25" name="j_password">
				</p>
				<p class="buttons">
					<input class="submitbutton" type="submit" value="Submit">
					<input class="resetbutton" type="reset"
						value="Reset">
				</p>
			</form>
		</div>
	</div>
</div>

</html>