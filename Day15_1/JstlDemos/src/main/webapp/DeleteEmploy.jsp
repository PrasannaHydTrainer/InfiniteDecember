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
	<form method="get" action="DeleteEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/> 
			<input type="submit" value="Delete" />
		</center>
	</form>
	<c:if test="${param.empno!=null}">
	<c:set var="empno" value="${param.empno}"/>
		<jsp:useBean id="beanDao" class="com.java.jstl.EmployDaoImpl"/>
	<c:out value="${beanDao.deleteEmployDao(empno)}"/>
	</c:if>
</body>
</html>