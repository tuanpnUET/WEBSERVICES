<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/form" var="url"></c:url>
<%--@elvariable id="user" type="com.S2kael.Unity.User"--%>
<form:form modelAttribute="add-person" method="post" action="${url}">
    <div>
        <form:label path="name">User name:</form:label>
        <form:input path="name"/>
        <p style="color: red"><form:errors path="name"></form:errors></p>
    </div>
    <div>
        <form:label path="id">ID:</form:label>
        <form:input path="id"/>
    </div>
    <div>
        <button type="submit">Submit </button>
    </div>
</form:form>
</body>
</html>