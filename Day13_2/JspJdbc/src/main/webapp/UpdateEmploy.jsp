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
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmployDAO dao = new EmployDaoImpl();
	Employ employFound = dao.searchEmployDao(empno);
%>
<form method="post" action="UpdateEmploy.jsp">
	Employ No : 
	<input type="number" name="empno" value=<%=employFound.getEmpno() %>
			readonly="readonly" /> <br/><br/> 
	Employ Name : 
	<input type="text" name="name" value='<%=employFound.getName() %>' /> <br/><br/> 
	Department : 
	<input type="text" name="dept" value=<%=employFound.getDept() %> /> <br/><br/>
	Designation : 
	<input type="text" name="desig" value=<%=employFound.getDesig() %> /> <br/><br/> 
	Basic : 
	<input type="text" name="basic" value=<%=employFound.getBasic() %> /> <br/><br/>
	<input type="submit" value="Update" />
</form>
<%
	if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
		Employ employNew = new Employ();
		employNew.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employNew.setName(request.getParameter("name"));
		employNew.setDept(request.getParameter("dept"));
		employNew.setDesig(request.getParameter("desig"));
		employNew.setBasic(Integer.parseInt(request.getParameter("basic")));
		dao.updateEmployDao(employNew);
%>
<jsp:forward page="EmployShow.jsp"/>
<%
	}
%>
</body>
</html>