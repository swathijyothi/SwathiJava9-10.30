<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>SPRING ORM FORM</h1>
<form name="insert" method="post" action="insert">
<table align="center">
<tr>
<td>First Name:</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>Last Name:</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td><input type="submit" name="action" value=insert></td>
</tr>
</table>
</form>
</body>
</html>