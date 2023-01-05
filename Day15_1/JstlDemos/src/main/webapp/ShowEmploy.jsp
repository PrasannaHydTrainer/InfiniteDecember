<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="employDao" class="com.java.jstl.EmployDaoImpl"/>
	<c:set var="employList" value="${employDao.showEmployDao()}"/>
	<table border="3">
	<tr>
		<th>Employ No</th>
		<th>Employ Name</th>
		<th>Department</th>
		<th>Designation</th>
		<th>Basic</th>
	</tr>
	<c:forEach var="employ" items="${employList}">
		<tr>
			<td>${employ.empno}</td>
			<td>${employ.name}</td>
			<td>${employ.dept}</td>
			<td>${employ.desig}</td>
			<td>${employ.basic}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>