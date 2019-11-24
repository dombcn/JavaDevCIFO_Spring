<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Colaboradores</title>
		
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<!-- Popper JS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
		<!-- Latest compiled JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<style>
			body { background-color: lightyellow; padding-top: 25px; }
		</style>
	</head>
	<body>
		<div class="container">
			<h1>Colaboradores</h1>
			<h3>Página para colaboradores [en construcción]</h3>
			<div class="row">
				<div class="col">
					<p>Usuario: <sec:authentication property="principal.username"/></p>
				</div>
				<div class="col">
					<p>Roles: <sec:authentication property="principal.authorities"/></p>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<sec:authorize access="hasRole('EDITOR')">
						<a href="${pageContext.request.contextPath}/private/editor" class="btn btn-primary">Editorial</a>
					</sec:authorize>
					<sec:authorize access="hasRole('ADMINISTRADOR')"> 
						<a href="${pageContext.request.contextPath}/private/admin" class="btn btn-primary">Administración</a>
					</sec:authorize>	
				</div>
				<div class="col"> 
					<form:form action="${pageContext.request.contextPath}/logout" method="POST">
						<button type="submit" class="btn btn-warning">Salir</button>
					</form:form>
				</div>
			</div>
		</div>
	</body>
</html>
