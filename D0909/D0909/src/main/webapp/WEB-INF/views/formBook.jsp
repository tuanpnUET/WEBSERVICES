<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/add-book" var="url"></c:url>
	<form:form modelAttribute="book" method="post" action="${url }">
	
	<form:input path="BookCode"/>
	<p style="color:red"><form:errors path="BookCode"></form:errors></p>
	<form:input path="Title"/>
	<p style="color:red"><form:errors path="Title"></form:errors></p>
	<form:input path="NumberOfPage"/>
	<p style="color:red"><form:errors path="NumberOfPage"></form:errors></p>
	<form:input path="Author"/>
	<p style="color:red"><form:errors path="Author"></form:errors></p>
	<form:input path="Price"/>
	<p style="color:red"><form:errors path="Price"></form:errors></p>
	<form:input path="ReleaseDate"/>
	<p style="color:red"><form:errors path="ReleaseDate"></form:errors></p>
	<form:input path="CategoryID"/>
	<p style="color:red"><form:errors path="CategoryID"></form:errors></p>
	<button type="submit">Submit</button>
	</form:form>
</body>
</html>