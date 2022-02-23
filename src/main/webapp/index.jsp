<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="source.Empresa"%>
<%@ page import="source.Departamento"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresa | Home</title>
</head>
<body>
<h1>Listado de empresas:</h1>
	<%
	Departamento d1 = new Departamento(1, "Ventas", "Lic. Gonzales");
	Departamento d2 = new Departamento(2, "Marketing", "Lic. Irias");
	Departamento d3 = new Departamento(3, "Recursos Humanos", "Lic. Alba Fernandez");
	Empresa e1 = new Empresa("325435", "Coffee Shop", "Venta Alimentos", d1);
	e1.setDepartamentos(d2);
	e1.setDepartamentos(d3);
	%>

	<table border="1">
		<tr>
		<thead>
			<th>Empresa</th>
			<th>RTN</th>
			<th>Rubro</th>
			<th>Departamento</th>
		</thead>
		</tr>
		<tr>
			<td><%=e1.getNombre()%></td>
			<td><%=e1.getRtn()%></td>
			<td><%=e1.getRubro()%></td>
			<td><%=e1.getAllDepartamentos()%></td>
		</tr>
		<tr>
			<td></td>
		</tr>
	</table>

</body>
</html>