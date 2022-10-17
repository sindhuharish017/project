<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>list of Authors</h2>
<table>
<tr><thead>
<td>id</td><td>Name</td><td>phone</td></thead>
</tr>
<tr>
<tbody>
<c:forEach items="${authors}" var="authors">
			<tr>
			<td><a href="UpdateAuthor/${authors.id}">${authors.id}</a>
			</td>
			<td>${authors.make}
			</td>
			<td>${authors.model}
			</td>
			</tr>
			</c:forEach>
</tbody>

</table>

</body>
</html>