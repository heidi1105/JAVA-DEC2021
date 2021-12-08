<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<title>Create Form</title>
</head>
<body>
	<div class="container mt-5">
		<h1> Update Form </h1>
		
		<form:form action="/movies/${movie.id}/edit" method="post" modelAttribute="movie" class="form">
		<input type="hidden" name="_method" value="put" />
		<form:input type="hidden" path="id" />
		
		<form:label path="name"> Movie Name </form:label>
		<form:errors style="color:red" path="name" />
		<form:input path="name" class="form-control"/>
		
		<form:label path="duration"> duration </form:label>
		<form:errors style="color:red" path="duration" />
		<form:input path="duration"  class="form-control"/>
		
		<form:label path="genre"> genre</form:label>
		<form:errors style="color:red" path="genre" />
		<form:input path="genre"  class="form-control"/>		
		
		<button class="btn btn-primary"> Update </button>
		</form:form>
		
	</div>
</body>
</html>