<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<title>Dashboard</title>
</head>
<body>
	<div class="container mt-5">
		<h1> Dashboard </h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th> ID </th>
					<th> Movie </th>
					<th> duration </th>
					<th> genre </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="movie" items="${movies }">
					<tr>
						<td>${movie.id }</td>
						<td><a href="/movies/${movie.id}"> ${movie.name } </a></td>
						<td>${movie.duration }</td>
						<td>${movie.genre }</td>
					</tr>
				</c:forEach>
			
			</tbody>
		
		</table>
		
	</div>
</body>
</html>