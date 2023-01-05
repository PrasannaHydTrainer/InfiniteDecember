<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="EmployAdd.jsp">
<center>
	Employ Name : 
	<input type="text" name="name" /> <br/><br/> 
	Employ Department : 
	<input type="text" name="dept" /><br/><br/>
	Employ Designation : 
	<input type="text" name="desig" /> <br/><br/> 
	Basic : 
	<input type="number" name="basic" /> <br/><br/>
	<input type="submit" value="Insert" />
</center>
</form>
<c:if test="${param.basic!=null}">
	<jsp:useBean id="employDao" class="com.java.jstl.EmployDaoImpl"/>
	<jsp:useBean id="employ" class="com.java.jstl.Employ"/>
	<jsp:setProperty property="*" name="employ"/>
	<c:out value="${employDao.addEmployDao(employ)}"/>
</c:if>
</body>
</html>