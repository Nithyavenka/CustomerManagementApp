<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Customer</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/deleteCustomer" method="post">
    <label for="Id">Customer ID:</label>
    <input type="text" name="Id" required="true" />
    <br>
    <br>
    <input type="submit" value="Delete Customer" />
</form>

</body>
</html>