<%@page import="com.infinite.jsp.Employ"%>
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
	<form method="post" action="AddEmploy.jsp">
		Employ Name : 
		<input type="text" name="name" /><br/><br/>
		Department : 
		<select name="dept">
			<option value="Java">Java</option>
			<option value="Dotnet">Dotnet</option>
			<option value="Sql">Sql</option>
			<option value="Angular">Angular</option>
		</select> <br/><br/>
		Designation : 
		<select name="desig">
			<option value="Manager">Manager</option>
			<option value="TeamLead">TeamLead</option>
			<option value="Programmer">Programmer</option>
		</select> <br/><br/>
		Basic : 
		<input type="number" name="basic"/> <br/><br/>
		<input type="submit" value="Insert" />
	</form>
	<%
		if (request.getParameter("basic")!=null) {
			EmployDAO dao = new EmployDaoImpl();
			Employ employ = new Employ();
			employ.setName(request.getParameter("name"));
			employ.setDept(request.getParameter("dept"));
			employ.setDesig(request.getParameter("desig"));
			employ.setBasic(Integer.parseInt(request.getParameter("basic")));
			dao.addEmployDao(employ);
	%>
		<jsp:forward page="EmployShow.jsp"/>
	<%
		}
	%>
</body>
</html>