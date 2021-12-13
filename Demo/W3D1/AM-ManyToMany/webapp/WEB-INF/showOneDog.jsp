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
	<h1> ${dog.dogName }</h1>
   	<h3> ID: ${dog.id }</h3>
   	<h3> Total treats : ${dog.treats.size() }</h3>
   	<ul>
   	<c:forEach var="eachTreat" items="${dog.treats }">
   		<li> ${eachTreat.treatName } -- $ ${eachTreat.price} </li>
   	
   	</c:forEach>
   	</ul>
   	
   	
   	<form action="/dogs/${dog.id }" method="post">
   	<input type="hidden" name="_method" value="put" />
   	<select name="treatId" class="form-select"> 
   		
   	<c:forEach var="oneTreat" items="${allTreats }">
   		<c:if test="${dog.treats.contains(oneTreat) == false }" >
	   		<option value="${oneTreat.id }"> 
	   		${oneTreat.treatName } -- $ ${oneTreat.price}
	   		</option>
   		</c:if>
   	</c:forEach>
   	</select>
   	<button class="btn btn-primary"> Add a treat</button>
   	</form>
    
    
    
   </div>
</body>
</html>
