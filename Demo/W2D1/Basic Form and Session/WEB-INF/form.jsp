<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container mt-5">
<h1> Form</h1>
<form action="/processForm" class="form" method ="post">
	<label> Gift </label>
	<input type="text" name="name" class="form-control"/>
	<label> Quantity </label>
	<input type="number" name="quantity" class="form-control"/>
	<label> Description </label>
	<textarea name="description" class="form-control"></textarea>
	<button class="btn btn-primary"> Submit </button>
</form>


</div>

</body>
</html>