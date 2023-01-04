<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanHelloWorld" class="com.infinite.beans.HelloWorld"/>
Default message is : 
<b>
<jsp:getProperty property="greeting" name="beanHelloWorld"/> </b>
<jsp:setProperty property="greeting" name="beanHelloWorld" value="Good Afternoon..."/>
<br/><hr/>
Updated Message is : 
<b>
<jsp:getProperty property="greeting" name="beanHelloWorld"/>
</b>
</body>
</html>