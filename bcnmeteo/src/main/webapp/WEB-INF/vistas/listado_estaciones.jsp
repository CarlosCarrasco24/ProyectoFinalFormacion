<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="head_info.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<jsp:include page="cabecera.jsp"></jsp:include>
		<h2>Listado de Estaciones</h2>
		<table class="table">
		<colgroup>
    		<col span="2">
  		</colgroup>
			<tr>
				<th>C&oacute;digo</th>
				<th>Nombre</th>
				<th>Latitud Estaci&oacute;n</th>
				<th>Longitud Estaci&oacute;n</th>
				<th>Fecha de alta</th>
				<th>Fecha &Uacute;ltima revisi&oacute;n</th>
				<th>Intervalo actualizaci&oacute;n</th>
				<th>Estado</th>
				<th>Calle</th>
				<th>C&oacute;digo Postal</th>
				<th>Poblaci&oacute;n</th>
				<th>Provincia</th>
				<th>Pa&iacute;s</th>
			</tr>
			<c:forEach var="estacion" items="${estaciones}">
			<tr>
				<td>${estacion.id}</td>
				<td>${estacion.nombre}</td>
				<td style="text-align: right;">${estacion.latitud}</td>
				<td style="text-align: right;">${estacion.longitud}</td>
				<td><fmt:formatDate value="${estacion.fechaAlta}" pattern="dd/MM/yyyy"/>
				<td><fmt:formatDate value="${estacion.ultimaRevision}" pattern="dd/MM/yyyy"/>
				<td style="text-align: center;">${estacion.intervaloTiempo}</td>
				<td>${estacion.estado}</td>
				<td>${estacion.direccion.calle}</td>
				<td>${estacion.direccion.codigoPostal}</td>
				<td>${estacion.direccion.poblacion}</td>
				<td>${estacion.direccion.provincia}</td>
				<td>${estacion.direccion.pais}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>