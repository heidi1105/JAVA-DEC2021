<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
	<form:form action="/gifts/${gift.id}/edit" method="post" modelAttribute="gift" class="form">
   		<input type="hidden" name="_method" value="put" />
   		
   		<form:label path="name" class="form-label"> Gift Name </form:label>
   		<form:errors path="name" class="text-danger" />	
   		<form:input path="name" type="text" class="form-control" />
   		

   		<form:label path="quantity" class="form-label">Quantity</form:label>
   		<form:errors path="quantity" class="text-danger" />	
   		<form:input path="quantity" type="number" class="form-control" />
   		
   		
   		<form:label path="description" class="form-label">Description</form:label>
   		<form:errors path="description" class="text-danger" />	
   		<form:textarea path="description" class="form-control"></form:textarea>
   		
		<button class="btn btn-primary"> Submit</button>

	</form:form>

</div>
</body>
</html>