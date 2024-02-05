<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
</head>
<body>
<h2>Add Customer</h2>
<form:form action="${pageContext.request.contextPath}/saveCustomer" modelAttribute="customer" method="post">
    <label for="customerName">Customer Name:</label>
    <form:input path="customerName" id="customerName" required="true" />
    <br>
    
    <label for="userName">Username:</label>
    <form:input path="userName" id="userName" required="true" />
    <br>
    
    <label for="password">Password:</label>
    <form:input path="password" id="password"  required="true" />
    <br>
    <label for="email">Email:</label>
    <form:input path="email" id="email" required="true" />
    <br>
    <label for="phoneNo">Phone Number:</label>
    <form:input path="phoneNo" id="phoneNo" required="true" />
    <br>
    <label for="address">Address:</label>
    <form:textarea path="address" id="address" required="true" rows="4" cols="50" />
    <br>
    <input type="submit" value="Add Customer" />
</form:form>
</body>
</html>