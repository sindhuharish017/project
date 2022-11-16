<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form action="/vehicleType/${id}" method="post">
 <table>
 <tr>
 <td>dlno</td>
 <td>password</td>
 <td>vehicletype</td>
 </tr>
 <tr>


 <td>  <input type="text" id="typePasswordX" class="form-control form-control-lg" name="dlno" value="${dlno}" readonly="readonly"/></td>
 <td> <input type="text" id="typePasswordX" class="form-control form-control-lg" name="pass" value="${pass}" readonly="readonly"/></td>
 <td><select id = "vehicleList" name = "vehicleType" value="${vehicleType}">
   <option value = "NONE">Select</option>
   <option value = "2wheeler">2wheeler</option>
   <option value = "3wheeler">3wheeler</option>
   <option value = "4wheeler">4wheeler</option>
</select> </td>
 </tr>
<td>
<button class="btn btn-outline-light btn-lg px-500"
										type="submit" name="submit" value="submit">SUBMIT</button> 
										</td>
	</table>					
				</form>
</body>
</html>