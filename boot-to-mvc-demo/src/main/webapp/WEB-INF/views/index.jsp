<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submitlogin" method="post" name="login">
Id:<input type="text" name="id">
Name:<input type="text" name="name">
City:<input type="text" name="address.city">
State:<input type="text" name="address.state">
<input type="submit" value="Submitdetails" name="submit">
</form>
</body>
</html>