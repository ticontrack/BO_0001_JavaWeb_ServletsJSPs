<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>login</title>
	</head>
<body>

	<h1>Login - Tienda Online</h1>

	<c:if test="${ not empty requestScope.error }">

		<hr />
		Error: ${ requestScope.error }
		<hr />
	</c:if>

	<form action="loginServlet" method="POST">

		<label for="name">Nombre</label> <input type="text" name="paramName"
			id="name" /> <br /> <label for="password">Clave</label> <input
			type="password" name="paramPwd" id="password" /> <input
			type="submit" value="Login" />

	</form>

</body>
</html>