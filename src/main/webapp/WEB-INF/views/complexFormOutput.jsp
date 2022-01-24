<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complex Form Output</title>
</head>
<body>
${student}<br>
	Name:${student.name }<br>
	id:${student.id }<br>
	date of birth:${student.date }<br>
	course:${student.courses }<br>
	gender:${student.gender }<br>
	type:${student.type }<br>
	Address:<br>
	street:${student.address.street}<br>
	city:${student.address.city}<br>
	
</body>
</html>