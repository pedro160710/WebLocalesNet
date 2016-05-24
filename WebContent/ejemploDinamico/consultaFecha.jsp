<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- el codigo de arriba es JSP y especifica que la implementacion es java -->
    <!-- cuanda el servidor devuelva el archivo al cliente va a mostrar que el contenido es contenType -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<header>
			Bienvenido, hoy es <%= new java.util.Date() %> 
			esta es una declaracion 
			<!-- dinamico significa que retorna contenido GENERADO EN TIEMPO DE EJECUCION EN EL SERVIDOR WEB -->
		</header>
		
	</body>
</html>