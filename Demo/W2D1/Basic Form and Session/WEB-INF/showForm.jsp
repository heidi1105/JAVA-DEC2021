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
<h1> Display gift form</h1>
<ul>
	<li> Gift: ${name }</li>
	<li> quantity: ${quantity }</li>
	<li> description: ${description }</li>
</ul>

</div>

</body>
</html>