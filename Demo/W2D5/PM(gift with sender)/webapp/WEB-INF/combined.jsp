<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h1>
			Welcome ${userName} <a href="/logout" class="btn btn-success">
				Logout</a>
		</h1>
		<h1>Create Form</h1>
		<form:form action="/dashboard" method="post" modelAttribute="newGift"
			class="form">
			<form:label path="name" class="form-label"> Gift Name </form:label>
			<form:errors path="name" class="text-danger" />
			<form:input path="name" type="text" class="form-control" />


			<form:label path="quantity" class="form-label">Quantity</form:label>
			<form:errors path="quantity" class="text-danger" />
			<form:input path="quantity" type="number" class="form-control" />


			<form:label path="description" class="form-label">Description</form:label>
			<form:errors path="description" class="text-danger" />
			<form:textarea path="description" class="form-control"></form:textarea>

			<form:input type="hidden" path="sender" value="${userId }" />
			<button class="btn btn-primary">Submit</button>

		</form:form>


		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Gift</th>
				<th>Quantity</th>
				<th>Description</th>
				<th>Sender</th>
				<th colspan="2">Action</th>
			</tr>
			<c:forEach var="gift" items="${gifts}">
				<tr>
					<td>${gift.id }</td>
					<td><a href="/gifts/${gift.id}">${gift.name }</a></td>
					<td>${gift.quantity}</td>
					<td>${gift.description }</td>
					<td>${gift.sender.userName }</td>
					<c:choose>
						<c:when test="${gift.sender.id == userId }">
						<td><a href="/gifts/${gift.id }/edit" class="btn btn-success btn-sm">Edit</a></td>
						<td>
							<form action="/gifts/${gift.id}/delete" method="post">
								<input type="hidden" name="_method" value="delete" />
								<button class="btn btn-danger btn-sm">Delete</button>
							</form>
						</td>						
						</c:when>
						<c:when test="${gift.receiver.id == userId }">
							<td></td>
							<td></td>						
						</c:when>
						
						<c:otherwise>
							<td>
								<form action="/gifts/${gift.id}/receive" method="post">
									<input type="hidden" name="_method" value="put" />
									<button class="btn btn-primary btn-sm">Receive</button>
								</form>							
							
							</td>
							<td></td>
						</c:otherwise>
					
					</c:choose>
		
				</tr>
			</c:forEach>
		</table>


	</div>
</body>
</html>