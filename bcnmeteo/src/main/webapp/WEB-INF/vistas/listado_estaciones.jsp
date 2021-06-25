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
				<th style="text-align: center;">Direcci&oacute;nes Monitorizadas</th>
				<th>Latitud Estaci&oacute;n</th>
				<th>Longitud Estaci&oacute;n</th>
				<th>Fecha de alta</th>
				<th>Fecha &Uacute;ltima revisi&oacute;n</th>
				<th>Intervalo actualizaci&oacute;n</th>
				<th>Estado</th>
				
			</tr>
			<c:forEach var="estacion" items="${estaciones}">
			<tr>
				<td>${estacion.id}</td>
				<td>${estacion.nombre}</td>
				<td style="text-align: left;">
				<c:forEach var="direccion" items="${estacion.direccion}">	
					<ul>
						<li>${direccion.calle}</li>
						C&oacute;digo postal: ${direccion.codigoPostal}
						Poblac&oacute;n: ${direccion.poblacion}
						Provincia: ${direccion.provincia}
						Pa&iacute;s: ${direccion.pais}
					</ul>
				</c:forEach>
				</td>
				<td style="text-align: right;">${estacion.latitud}</td>
				<td style="text-align: right;">${estacion.longitud}</td>
				<td><fmt:formatDate value="${estacion.fechaAlta}" pattern="dd/MM/yyyy"/>
				<td><fmt:formatDate value="${estacion.ultimaRevision}" pattern="dd/MM/yyyy"/>
				<td style="text-align: center;">${estacion.intervaloTiempo}</td>
				<td>${estacion.estado}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>