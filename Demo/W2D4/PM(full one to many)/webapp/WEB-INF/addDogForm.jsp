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
   <h1> Add a dog</h1>
   	<form:form action="/dogs/add" method="post" modelAttribute="dog" class="form-control">
   	<div>
   		<form:label path="petname" class="form-label"> Pet Name </form:label>
   		<form:input path="petname" type="text" class="form-control" />
   		<form:errors path="petname" class="text-danger" />
   	</div>
   	 <div>
   		<form:label path="age" class="form-label"> Age </form:label>
   		<form:input path="age" type="number" class="form-control" />
   		<form:errors path="age" class="text-danger" />
   	</div>
   	<div>
   		<form:label path="breed" class="form-label"> Breed </form:label>   		
   		<form:select path="breed" class="form-select">
   			<c:forEach var="eachBreed" items="${breeds }">
   				<form:option value="${eachBreed.id }">${eachBreed.name }</form:option>
   			</c:forEach>
   		</form:select>
   	</div>
   	
   	
   	<button class="btn btn-primary">Add a dog</button>
   	</form:form>
   
   </div>
</body>
</html>