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
	<form method="get" action="SearchEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.empno!=null}">
	<c:set var="empno" value="${param.empno}"/>
		<jsp:useBean id="beanDao" class="com.java.jstl.EmployDaoImpl"/>
		<c:set var="employ" value="${beanDao.searchEmployDao(empno)}"/>
		<c:if test="${employ!=null}">
		Employ No : 
			<c:out value="${employ.empno}"/> <br/>
		Employ Name : 
			<c:out value="${employ.name}"/>
		</c:if>
	</c:if>
</body>
</html>