<%@page import="com.infinite.jsp.EmployDaoImpl"%>
<%@page import="com.infinite.jsp.EmployDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Login.jsp">
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passCode" /> <br/><br/>
		<input type="submit" value="Login" />
	</form>
	<%
		if (request.getParameter("userName")!=null && 
				request.getParameter("passCode")!=null
				) {
			String user = request.getParameter("userName");
			String pwd = request.getParameter("passCode");
			EmployDAO dao = new EmployDaoImpl();
			int count = dao.authenticate(user, pwd);
			out.println(count);
		}
	%>
</body>
</html>