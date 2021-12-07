<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1> Showing basic form</h1>
<table class="table">
	<thead>
		<tr>
			<th> Name </th>
			<th> Singer </th>
			<th> Debut </th>
			<th> Debut (formatted) </th>
			<th> Debut time (formatted) </th>
		</tr>
	</thead>
	<tbody>
		<tr> 
			<td> ${name } </td>
			<td> ${singer } </td>
			<td> ${debut } </td>
			<td> 
				<fmt:formatDate type="date" value="${debut }" />
			</td>
			<td> 
				<fmt:formatDate type="time" value="${debut }" />
			</td>
		</tr>
	
	</tbody>

</table>


</body>
</html>