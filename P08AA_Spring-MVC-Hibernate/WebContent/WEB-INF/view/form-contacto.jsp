<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Tarea</title>
		<style>
			.error {color: red;}
			.jumbotron {height: 200px;}
		</style>
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
			crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
			integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" 
			crossorigin="anonymous"></script>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
	</head>
	<body>
		<div class="container">
		
			<div class="jumbotron">
				<img src="${pageContext.request.contextPath}/resources/img/contact.png"
					alt="contactos" class="float-right" height="150" />
				<h1>${contacto.idcontacto==0 ? "Nuevo" : "Editar"} contacto</h1>
				<p>Mantenimiento de una agenda de contactos realizado</p>
				<p>con Spring e Hibernate.</p>
			</div>
			
			<form:form action="savecontacto" modelAttribute="contacto" method="post">
				<form:hidden path="idcontacto" />
				<div class="form-group">
					<label for="nombre">Nombre:</label>
					<form:input path="nombre" class="form-control" />
					<div><form:errors path="nombre" cssClass="error" /></div>
				</div>
				<div class="form-group">
					<label for="email">E-mail:</label>
					<form:input path="email" class="form-control" />
					<div><form:errors path="email" cssClass="error" /></div>
				</div>
				<div class="form-group">
					<label for="telefono">Teléfono:</label>
					<form:input path="telefono" class="form-control" />
				</div>
				<input type="submit" value="Guardar" class="btn btn-success" />
				<a href="${pageContext.request.contextPath}/agenda/contacto/lista" 
					class="btn btn-outline-primary float-right">Volver a lista de contactos</a>
			</form:form>
		</div>
	</body>
</html>
