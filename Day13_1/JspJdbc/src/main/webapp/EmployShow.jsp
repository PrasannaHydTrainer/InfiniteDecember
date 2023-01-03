<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.infinite.jsp.Employ"%>
<%@page import="java.util.List"%>
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
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
	<%
		EmployDAO dao = new EmployDaoImpl();
		List<Employ> employList = dao.showEmployDao();
		for(Employ employ : employList) {
	%>
		<tr>
			<td><%=employ.getEmpno() %> </td>
			<td><%=employ.getName() %> </td>
			<td><%=employ.getDept() %> </td>
			<td><%=employ.getDesig() %> </td>
			<td><%=employ.getBasic() %> </td>
		</tr>
	<%
		}
	%>
		
	</table>
</body>
</html>