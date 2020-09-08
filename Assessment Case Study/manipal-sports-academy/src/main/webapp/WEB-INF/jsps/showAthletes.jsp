<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	<tr>
		<th>Athlete ID</th>
		<th>Name</th>
		<th>Gender</th>
		<th>Category</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	
	<c:forEach var="athlete" items="${athleteList}">
	<tr>
		<td>${athlete.id}</td>
		<td>${athlete.name}</td>
		<td>${athlete.gender}</td>
		<td>${athlete.category}</td>
		<td>${athlete.email}</td>
		<td>${athlete.mobile}</td>
	</tr>	

	</c:forEach>
	
</body>
</html>