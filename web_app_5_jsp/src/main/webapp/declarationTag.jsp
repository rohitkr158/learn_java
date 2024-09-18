<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
	
		protected int x = 10;		//access specifier allowed
	
		public int test(){			//methods are allowed
			System.out.println(100);
		}
		
		int y = 20;					//non-static variable are allowed
		
		static int z = 60;			//static variables are allowed
		
		public int test1(){			//methods are allowed
			return 100;
		}
		
		public int test2(){			
			int a = 40;				//local variables are allowed
			return a;
		}
		
	///	out.println(100);			//implicit objects are not allowed
	
			
	%>
	
	
	<%
		out.println(x);
		out.println(y);
		out.println(z);
	out.println(test());
		out.println(test1());
		out.println(test2());
		
	%>
</body>
</html>