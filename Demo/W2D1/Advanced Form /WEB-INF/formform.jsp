<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1> Basic form</h1>

<form:form action="/processFormform" method="post" modelAttribute="song" class="form">
	<form:label path="name"> Song name </form:label>
	<form:input path="name" class="form-control"/>

	<form:label path="singer"> Singer </form:label>
	<form:input path="singer" class="form-control"/>
	
	<button class="btn btn-primary"> Submit </button>
</form:form>







</form>
</body>
</html>