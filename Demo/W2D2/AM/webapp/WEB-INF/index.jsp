<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP page</title>

</head>
<body>
	<h1> Loop using jsp</h1>
	<% for(int i =0; i< 5; i++){ %>
		<h2> <%= i %></h2>
	<% } %>
	
	<h1> Loop using jsp</h1>
	<h3><c:out value="${ 2+2 }"></c:out></h3>
	<h3>${2+2 }</h3>
	<h1> Model attributes </h1>
	<h3> ${name} </h3>
	
	<h1>My Christmas Gifts</h1>
	<ul>
	<c:forEach var="element" items="${giftsInJsp }">
		<li> ${element } </li>
	</c:forEach>
	
	</ul>
	
	
	
	
	
</body>
</html>