<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Registration</title>
</head>
<body>
	<h2>Add Registration here..</h2>
	<form action="addReg" method="post">
		<pre>
			Name:   <input type="text" name="name" /> <br/> 
			Course: <input type="text" name="course" /> <br/>
			Email:  <input type="email" name="email" /> <br/>		
			Mobile: <input type="number" name="mobile" /> <br/>
			<input type="submit" value="save" />
		</pre>
	</form>
</body>
</html>