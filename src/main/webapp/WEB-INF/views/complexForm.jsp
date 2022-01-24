<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complex Form</title>

</head>
<body>
<div style="color:red">
<form:errors path="student.*" />
</div>


<form action="handleForm" method="post">
	Your name:<input type="text" name="name" placeholder="Enter Name"><br>
	Your id:<input type="text" name="id" placeholder="Enter id"><br>
	Your dob:<input type="text" name="date" placeholder="dd/mm/yyyy"><br>
	Select Courses:
		<select name="courses">
			<option>Java</option>
			<option>C</option>
			<option>Python</option>
		</select> <br>
	Select Gender:<br>
	<input type="radio" name="gender" value="male">Male<br>
	<input type="radio" name="gender" value="female">Female<br>
	
	Select Type:
	<select name="type">
	<option value="oldstudent">Old Student</option>
	<option value="newstudent">New Student</option>
	<option>
	</select><br>
	Your Address:<br>
	Your street:<input type="text" name="address.street" placeholder="Enter Street"><br>
	Your city:<input type="text" name="address.city" placeholder="Enter city"><br>
	
	
	<button>Register</button>

</form>
</body>
</html>