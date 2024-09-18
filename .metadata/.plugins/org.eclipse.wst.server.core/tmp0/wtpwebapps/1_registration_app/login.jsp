<!-- login page -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration App</title>
</head>
<body>
			<h2>Login here..</h2>

	<div>
		<%
		if (request.getAttribute("error") != null) {
			out.println(request.getAttribute("error"));
		}
		%>
	</div>
	<form action="verifyLogin" method="post">
		<pre>
				Email:	  <input type="email" name="email" /> <br>
				Password: <input type="password" name="password" /> <br>
				<input type="submit" value="Login" />
		</pre>
	</form>
</body>
</html>


