<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
		<h1>Dog Favorite Treats</h1>
		<a href="/dogs/add"> Add a dog</a> <a href="/treats/add"> Add a
			treat</a>
			
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Dog</th>
				<th>Total Treats</th>
			</tr>
			<c:forEach var="dog" items="${dogs }">
				<tr>
					<td>${dog.id } </td>
					<td><a href="/dogs/${dog.id}">${dog.dogName }</a></td>
					<td> ${dog.treats.size() }</td>
			</c:forEach>

		</table>



	</div>
</body>
</html>
