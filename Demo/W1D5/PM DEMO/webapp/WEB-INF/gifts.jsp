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
	
	<h1>My Christmas Gifts</h1>
	<ul>
	<c:forEach var="gift" items="${gifts }">
	<li> Gift: ${gift.getName() } Price: ${gift.price } </li>
	</c:forEach>
	
	</ul>
	
	
	
	
	
</body>
</html>