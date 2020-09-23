<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="contentType" content="text/html" charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Danh sách khách hàng:</h1>
	<c:forEach items="${listUser }" var="userDTO">
	<h1>Họ tên: ${userDTO.name}</h1>
	<h1>Số điện thoại: ${userDTO.phone}</h1>
	<h2>Tuoi: ${userDTO.age}</h2>
	</c:forEach>
	
</body>
</html>