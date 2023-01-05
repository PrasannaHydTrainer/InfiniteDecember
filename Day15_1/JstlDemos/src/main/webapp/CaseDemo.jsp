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
<form method="get" action="CaseDemo.jsp">
	<center>
		Student No : 
		<input type="number" name="sno" /><br/><br/>
		<input type="submit" value="Show" />
	</center>
</form>
<c:if test="${param.sno!=null}">
	<c:set var="sno" value="${param.sno}"/>
	<c:choose>
		<c:when test="${sno==1}">
			<c:out value="Hi I am Avesh..."/>
		</c:when>
		<c:when test="${sno==2}">
			<c:out value="Hi I am Chandu..."/>
		</c:when>
		<c:when test="${sno==3}">
			<c:out value="Hi I am Gaurav..."/>
		</c:when>
		<c:when test="${sno==4}">
			<c:out value="Hi I am Sourabh..."/>
		</c:when>
		<c:otherwise>
			<c:out value="Invalid Message..."/>
		</c:otherwise>
	</c:choose>
</c:if>
</body>
</html>