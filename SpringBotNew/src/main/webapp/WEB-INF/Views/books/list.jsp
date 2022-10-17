<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>list of Books</h2>
<table>
<tr><thead>
<td>id</td><td>Name</td><td>whenPublished</td></thead>
</tr>
<tr>
<tbody>
<c:forEach items="${books}" var="books">
			<tr>
			<td><a href="updateCar/${books.id}">${books.id}</a>
			</td>
			<td>${books.make}
			</td>
			<td>${books.model}
			</td>
			</tr>
			</c:forEach>
</tbody>

</table>
</body>
</html>