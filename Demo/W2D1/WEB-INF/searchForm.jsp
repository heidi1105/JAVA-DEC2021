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
<h1> Search Form</h1>
<form action="/showSearch" class="form">
	<label> Search </label>
	<input type="text" name="keyword" class="form-control"/>
	<button class="btn btn-primary"> Submit </button>
</form>


</div>

</body>
</html>