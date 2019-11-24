<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Nature MediaX</title>
		
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<!-- Popper JS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
		<!-- Latest compiled JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

		<style>
			body { background-color: lightgrey; padding-top: 25px; }
		</style>
	</head>
	<body>
		<div class="container">
			<img src="<spring:url value="/images/lake.jpg"/>"
				alt="nature" class="float-right" height="300" />	
			<h1>Nature MediaX, s.l.</h1>
			<p>Empresa dedicada a la producción y distribución de libros, revistas mensuales
			 y contenido online relacionados con la naturaleza, la ecología, la medicina natural, ...</p>
			<a href="${pageContext.request.contextPath}/private/index" class="btn btn-primary">Empleados y Colaboradores</a>
		</div>
	</body>
</html>
