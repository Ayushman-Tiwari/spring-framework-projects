<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.ayushman.spring.springmvc.controller.dto.Employee, java.util.List"%>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Object Details</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employees");
	for(Employee e: employees){
	out.println(e);	
	}
	%>
</body>
</html>