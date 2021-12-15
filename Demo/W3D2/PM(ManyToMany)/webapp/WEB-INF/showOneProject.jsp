
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

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
	<h1> ${project.title }</h1>
	<ul>
	<li> Project title: ${project.title }</li>
	<li> Project description: ${project.description }</li>
	<li> Creator: ${project.creator.firstname } ${project.creator.lastname }</li>
	<li> Due Date : <fmt:formatDate type="date" value="${project.duedate }" /></li>
	
	</ul>
   
   </div>
</body>
</html>