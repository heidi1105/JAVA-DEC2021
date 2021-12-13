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
  	<form:form action="/treats/add" method="post" modelAttribute="treat" class="form-control">
   	<div>
   		<form:label path="treatName" class="form-label"> Treat Name </form:label>
   		<form:input path="treatName" type="text" class="form-control" />
   		<form:errors path="treatName" class="text-danger" />
   	</div>
   	 <div>
   		<form:label path="price" class="form-label"> Price </form:label>
   		<form:input path="price" type="number" step="0.01" class="form-control" />
   		<form:errors path="price" class="text-danger" />
   	</div>
        <button class="btn btn-primary"> Add a Treat</button>
   	</form:form>
   
   </div>
</body>
</html>
