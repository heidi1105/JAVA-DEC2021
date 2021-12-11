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
   	<form:form action="/breeds/add" method="post" modelAttribute="breed" class="form-control">
   	<div>
   		<form:label path="name" class="form-label"> Breed Name </form:label>
   		<form:input path="name" type="text" class="form-control" />
   		<form:errors path="name" class="text-danger" />
   	</div>
   	<button>Add a breed</button>
   	</form:form>
   
   </div>
</body>
</html>