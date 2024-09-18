<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
				//html tag not allowed
		
		request.setAttribute("y", 100);		//implicit object are allowed
				
		public int x = 10;   //access specifier not allowed

		int y = 20;		//non-static variable not allowed
		
		static int z = 30;		//static variable not allowed
		
		int a = 500;			//local variable allowed
		System.out.println(a);
		
		public void test(){
			
		}
		
	%>
</body>
</html>