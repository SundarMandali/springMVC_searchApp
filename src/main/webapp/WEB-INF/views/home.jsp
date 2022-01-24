<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME PAGE</title>
<link href=" <c:url value="/resources/css/style.css" /> ">
<script src=" <c:url value="/resources/js/script.js" />" ></script>
</head>
<body>

<img alt="Loading" src=" <c:url value="/resources/image/rc.jpg"/>" >
<form action="search">
<input type="text" name="querybox" placeholder="Enter your keyword" ><br>
<button>Search</button>
</form>

</body>
</html>