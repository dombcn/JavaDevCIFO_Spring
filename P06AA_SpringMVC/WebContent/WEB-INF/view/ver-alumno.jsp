<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> <title>Datos alumno</title>
	</head>
	<body>
		<h1>Alumno</h1>
		<p>Nombre:${alumno.nombre}</p>
		<p>DNI:${alumno.dni}</p>
		<p>e-mail address:${alumno.email}</p>
		<p>Becado:${alumno.becado}</p>
		Asignaturas:
		<ul>
			<c:forEach var="asign" items="${alumno.asignaturas}">
				<li>${asign}</li>
			 </c:forEach>
		</ul>
	</body>
</html>
