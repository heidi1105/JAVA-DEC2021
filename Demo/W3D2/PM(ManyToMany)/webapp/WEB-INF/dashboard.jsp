
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
<title></title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
		<h1>Project Manager</h1>
		<h5>Welcome, ${firstname}</h5>
		<a href="/logout"> Logout</a> <a href="/projects/add"> Add a
			project</a>

		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Project</th>
				<th>Team Lead</th>
				<th>Due Date</th>
				<th colspan="2">Actions</th>
			</tr>

			<c:forEach var="project" items="${allProjects }">			
				<c:if test="${project.creator.id != userId && joinedProjects.contains(project)==false"} >


					<tr>
						<td>${project.id }</td>
						<td><a href="/projects/${project.id}">${project.title }</a></td>
						<td>${project.creator.firstname }${project.creator.lastname }</td>
						<td><fmt:formatDate type="date" value="${project.duedate }" /></td>

						<td>
							<form action="/projects/${project.id }/join" method="post">
								<input type="hidden" name="_method" value="put" />
								<button class="btn btn-primary">Join</button>
							</form>


						</td>
						<td></td>
					</tr>
				</c:if>

			</c:forEach>

		</table>



		<h1>My Projects</h1>

		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Project</th>
				<th>Team Lead</th>
				<th>Due Date</th>
				<th colspan="2">Actions</th>
			</tr>
			<c:forEach var="project" items="${allProjects }">
				<c:if test="${project.creator.id ==userId} ">

					<tr>
						<td>${project.id }</td>
						<td><a href="/projects/${project.id}">${project.title }</a></td>
						<td>${project.creator.firstname }${project.creator.lastname }</td>
						<td><fmt:formatDate type="date" value="${project.duedate }" />

						</td>
						<c:choose>
							<c:when test="${project.creator.id == userId }">
								<td><a href="/projects/${project.id }/edit"
									class="btn btn-success">Edit</a></td>
								<td>
									<form action="/projects/${project.id }/delete" method="post">
										<input type="hidden" name="_method" value="delete"> <input
											type="submit" value="Delete" class="btn btn-danger" />
									</form>
								</td>
							</c:when>
							<c:otherwise>
								<td></td>
								<td></td>
							</c:otherwise>
						</c:choose>
					</tr>

				</c:if>
			</c:forEach>

			<c:forEach var="joinedProject" items="${joinedProjects }">
				<tr>
					<td>${joinedProject.id }</td>
					<td><a href="/projects/${joinedProject.id}">${joinedProject.title }</a></td>
					<td>${joinedProject.creator.firstname } ${joinedProject.creator.lastname }</td>
					<td><fmt:formatDate type="date" value="${joinedProject.duedate }" />
					<td>
							<form action="/projects/${joinedProject.id }/leave" method="post">
								<input type="hidden" name="_method" value="put" />
								<button class="btn btn-primary">Leave</button>
							</form>
					
					</td>
					<td></td>


				</tr>
			</c:forEach>

		</table>

	</div>
</body>
</html>