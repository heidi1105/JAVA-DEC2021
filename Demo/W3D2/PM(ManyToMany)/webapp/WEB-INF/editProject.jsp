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
   <h1> Edit a project </h1>
   	<form:form action="/projects/${project.id }/edit" method="post" modelAttribute="project" class="form-control">
   	<input type="hidden" name="_method" value="put" />
   	
   	<div>
   		<form:label path="title" class="form-label"> Title </form:label>
   		<form:errors path="title" class="text-danger" />
   		<form:input path="title" type="text" class="form-control" />
   	</div>
   	
   	<div>
   		<form:label path="description" class="form-label"> Description </form:label>
   		<form:errors path="description" class="text-danger" />
   		<form:textarea path="description" class="form-control"></form:textarea>
   	</div>   
   		
   	<div>
   		<form:label path="duedate" class="form-label"> Due Date </form:label>
   		<form:errors path="duedate" class="text-danger" />
   		<form:input path="duedate" type="date" class="form-control" />
   	</div> 
        <form:hidden path="creator" value="${project.creator.id }" />  	
        <button class="btn btn-primary">Edit a project</button>
   	</form:form>


   
   </div>
</body>
</html>