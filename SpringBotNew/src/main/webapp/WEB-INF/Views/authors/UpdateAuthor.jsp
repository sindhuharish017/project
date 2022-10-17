<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/authors/UpdateAuthor/${authors..id }" method="post">
<input type="hidden" name="id" value="${authors.id}">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="Name" value="${authors.name }"/></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone" value="${authors.phone}"/></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Update"></td>

				<td><input type="submit" name="submit" value="Cancel"></td>
			</tr>
		</table>

</body>
</html>