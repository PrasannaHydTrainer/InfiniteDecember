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
	<form method="post" action="AddUser.jsp">
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passCode" /> <br/><br/>
		Re-Type Password : 
		<input type="password" name="retypePassCode" /> <br/><br/> 
		<input type="submit" value="Create Account" />
	</form>
	<%
		if (request.getParameter("userName")!=null && 
			request.getParameter("passCode")!=null
				) {
			String pwd = request.getParameter("passCode");
			String retype = request.getParameter("retypePassCode");
			if (pwd.equals(retype)) {
				EmployDAO dao = new EmployDaoImpl();
				dao.addUser(request.getParameter("userName"), pwd);
			} else {
				out.println("Password Mismatch...");
			}
		}
	%>
</body>
</html>