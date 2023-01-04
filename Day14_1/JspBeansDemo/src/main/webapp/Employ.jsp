<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Employ.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/> 
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Department : 
			<input type="text" name="dept" /> <br/><br/> 
			Designation : 
			<input type="text" name="desig" /> <br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<jsp:useBean id="beanEmploy" class="com.infinite.beans.Employ"/>
	<jsp:setProperty property="*" name="beanEmploy"/> 
	Employ No :
	<jsp:getProperty property="empno" name="beanEmploy"/> <br/>
	Employ Name : 
	<jsp:getProperty property="name" name="beanEmploy"/>
</body>
</html>