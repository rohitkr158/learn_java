<%@page import="java.io.FileReader, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file = "welcome.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//scriptlet tag
	FileReader f = new FileReader("F:/hello/A.txt");
	%>

	<%=new Date()%>




</body>
</html>