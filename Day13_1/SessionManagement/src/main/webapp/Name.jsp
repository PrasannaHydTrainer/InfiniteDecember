<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Name.jsp">
		First Name : 
		<input type="text" name="firstName" /> <br/><br/>
		Last Name : 
		<input type="text" name="lastName" /> <br/><br/> 
		<input type="submit" value="Show" />
	</form>
	<%
		if (request.getParameter("firstName")!=null && 
				request.getParameter("lastName") !=null
				) {
			String fullName = request.getParameter("firstName") + 
					" " +request.getParameter("lastName");
			out.println("Full Name is  " +fullName);
		}
	%>
</body>
</html>