<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>My Name is : ${Name}</h2>
	<h3>My Email is : ${Email}</h3>
	<h4>My Number Is : ${Num}</h4>
	<h5>My Course Is : ${Course}</h5>
	<hr>
	<c:forEach var="item" items="${marks}">
	    <h5>Marks Of Semeters : ${item}</h5>
	    <h5>-------------------------------------------</h5>
	</c:forEach>
</body>
</html>