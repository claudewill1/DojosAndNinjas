<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand text-decoration-none" href="#">Driver's License</a>
		
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent">
		<span class="navbar-toggler-icon"></span>
		</button>
		
		<!-- Navbar links -->
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item">
					<a class="nav-link active" href="/">Dashboard</a>
				</li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<h1>${dojo.name} Location Ninjas</h1>
		<table class="table table-dark table-striped">
			<thead>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</thead>
			<tbody>
				<c:forEach items="${dojo.ninjas}" var="ninja">
					<tr>
						<td>${ninja.firstName}</td>
						<td>${ninja.lastName}</td>
						<td>${ninja.age}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>