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
					<a class="nav-link active" href="dojos">Dashboard</a>
				</li>
			</ul>
		</div>
		
	</nav>
	<div class="container">
		<h1>New Ninja</h1>
		<form:form class="form" action="/ninjas" method="post" modelAttribute="ninja">
			<div class="form-group row">
				<form:label path="firstName">First Name:</form:label>
				<form:input type="text" path="firstName"/>
			</div>
			<div class="form-group row">
				<form:label path="lastName">Last Name:</form:label>
				<form:input type="text" path="lastName"/>
			</div>
			<div class="form-group row">
				<form:label path="age">Age:</form:label>
				<form:input type="text" path="age"/>
			</div>
			<div class="form-group row">
				<form:label path="dojo">Select Dojo:</form:label>
				<form:select path="dojo">
					<c:forEach items="${dojos}" var="dojo">
						<form:option value="${dojo.id}">${dojo.name}</form:option>
					</c:forEach>
				</form:select>
				
			</div>
			<input type="submit" class="btn btn-primary" value="Create"/>
		</form:form>
	</div>
</body>
</html>