<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Danh sách Category:</h1>
	<c:forEach items="${listCategory }" var="categoryDTO">
	<h1>ID: ${categoryDTO.CategoryID}</h1>
	<h1>Ten: ${categoryDTO.CategoryName}</h1>
	<h2>Mieu Ta: ${categoryDTO.Description}</h2>
	</c:forEach>
</body>
</html>