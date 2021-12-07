<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1> Basic form</h1>

<form action="/processBasicform" method="post" class="form">
<label> Song </label>
<input type="text" name="name" class="form-control" />
<label> Singer </label>
<input type="text" name="singer" class="form-control" />
<label> Debut date </label>
<input type="date" name="debut" class="form-control" />

<button class="btn btn-primary"> Submit </button>



</form>
</body>
</html>