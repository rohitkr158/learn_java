<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add numbers</title>
</head>
<body>
	<form action="AddController" method="post">
		<h2>Add numbers</h2>
		Enter First Number: <input type="number" name="firstNumber" /> 
		Enter Second Number: <input type="number" name="secondNumber" /> 
		<input type="submit" value="add" />
	</form>

	<%
	if (request.getAttribute("res") != null) {
		out.println(request.getAttribute("res"));
	}
	%>
</body>
</html>