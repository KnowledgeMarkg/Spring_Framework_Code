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
   <h2>My Name Is : ${contact.name}</h2>
   <h3>My Email is : ${contact.email}</h3>
   <h4>My Message is : ${contact.message}</h4>
</body>
</html>