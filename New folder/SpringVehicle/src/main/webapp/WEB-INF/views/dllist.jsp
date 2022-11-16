<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body class="w-75">
	<h2 align="center">List of DL</h2>
	<table align="center" class="table table-dark table-striped">
		<thead>
			<tr>
				<td>ID</td>
				<td>DLNo</td>
				<td>NAME</td>
				<td>DateofBirth</td>
				<td>Address</td>
				<td>FromDate</td>
				<td>ToDate</td>
				<td>Age</td>
				<td>MobNo</td>
				<td>vehicleType</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dl}" var="dl">
				<tr>
					<td>${dl.id}</td>
					<td>${dl.dlno }</td>
					<td>${dl.name }</td>
					<td>${dl.dateofBirth }</td>
					<td>${dl.address }</td>
					<td>${dl.fromDate }</td>
					<td>${dl.toDate }</td>
					<td>${dl.age}</td>
					<td>${dl.mobNo}</td>
					<td><c:forEach var="v" items="${dl.vehicle}">  
						${v} </c:forEach></td>
					

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>