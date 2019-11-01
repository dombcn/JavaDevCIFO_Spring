<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Alta alumnos</title>
		<style>
			.error {color: red;}
		</style>
	</head>
	<body>
		<form:form action="procesar" modelAttribute="alumno">
			Nombre(*):<form:input path="nombre"/><form:errors path="nombre" cssClass="error" />
			<br/>DNI(*):<form:input path="dni" /> <form:errors path="dni" cssClass="error" />
			<br/>e-mail address: <form:input path="email" /> <form:errors path="email" cssClass="error" />
			<br/>Becado?: <form:radiobuttons path="becado" items="${alumno.opcBecado}" />
			<br/><form:checkboxes path="asignaturas" items="${alumno.listaAsignaturas}" />
			<br/>
			<input type="submit">
      	</form:form>
	</body>
</html>
