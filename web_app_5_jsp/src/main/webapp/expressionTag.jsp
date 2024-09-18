<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!	//declaration tag
		int x = 10;			//non-static variable are allowed
	
		static int y = 20;	//static variable are allowed
		
		protected int z = 30;	//access specifier are allowed
		
		public int test(){		//methods are allowed
			int a = 50;
			return a;
		}
		
	%>

	<%= x %>
	<%= y %>
	<%= z %>
	<%= test() %>
	
</body>
</html>