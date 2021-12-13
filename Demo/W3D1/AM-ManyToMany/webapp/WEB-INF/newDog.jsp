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
  	<form:form action="/dogs/add" method="post" modelAttribute="dog" class="form-control">
   	<div>
   		<form:label path="dogName" class="form-label"> Dog Name </form:label>
   		<form:input path="dogName" type="text" class="form-control" />
   		<form:errors path="dogName" class="text-danger" />
   	</div>
        <button class="btn btn-primary"> Add a dog</button>
   	</form:form>


   
   </div>
</body>
</html>
