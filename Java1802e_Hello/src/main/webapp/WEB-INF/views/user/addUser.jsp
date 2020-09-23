<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value = '/resource/css/style.css'/>">
<script type="text/javascript" src="<c:url value = '/resource/js/main.js'/>"></script>
</head>
<body>
	<h1>Form khách hàng</h1>
	<c:url value="/add-new-user" var="url"></c:url>
	<form:form modelAttribute="userDTO" method="post" action="${url }">				
		<p>Họ tên: </p><form:input path="name"/>
		<p style="color:red"><form:errors path="name"></form:errors></p>
		<p>Số điện thoại: </p><form:input path="phone"/>
		<p style="color:red"><form:errors path="phone"></form:errors></p>
		<p>Tuổi: </p><form:input path="age"/>
		<p style="color:red"><form:errors path="age"></form:errors></p>
		<button type="submit">Add</button>
	</form:form>
</body>
</html>