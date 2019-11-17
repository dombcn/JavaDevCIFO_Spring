<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lista de tareas</title>
		<style>
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
				<h1>Agenda de contactos</h1>
				<p>Mantenimiento de una agenda de contactos realizado</p>
				<p>con Spring e Hibernate.</p>
			</div>
			
			<a href="${pageContext.request.contextPath}/agenda/contacto/addcontacto" class="btn btn-primary mb-1">Añadir contacto</a>
			<table class="table table-striped">
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>E-mail</th>
					<th>Teléfono</th>
					<th>Acciones</th>
				</tr>
				<c:forEach var="contacto" items="${contactos}">
				
					<c:url var="linkEditar" value="/agenda/contacto/updatecontacto">
					<c:param name="idcontacto" value="${contacto.idcontacto}" />
					</c:url>
					
					<c:url var="linkBorrar" value="/agenda/contacto/deletecontacto">
					<c:param name="idcontacto" value="${contacto.idcontacto}" />
					</c:url>
					
					<tr>
						<td>${contacto.idcontacto}</td>
						<td>${contacto.nombre}</td>
						<td>${contacto.email}</td>
						<td>${contacto.telefono}</td>
						<td>
							<a href="${linkEditar}" class="btn btn-outline-success btn-sm">Editar</a>
							<a href="${linkBorrar}" onclick="if(!confirm('¿Está seguro?')) return false" 
								class="btn btn-outline-danger btn-sm">Borrar</a>
						</td>
					</tr>
					
	             </c:forEach>
	      </table>
		</div>
	</body>
</html>
