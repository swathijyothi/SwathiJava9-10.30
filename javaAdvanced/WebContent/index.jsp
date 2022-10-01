<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1 align="center"> STUDENT REGISTRATION</h1>
<br>
<form name="my form" method="post" action="EmployeeController">
<table align="center">
<tr>
<td>First Name:</td>
<td ><input name="fname" type="text;">
<span  id="fname"></span>
</td>
</tr>
<tr>
<td>Last Name:</td>
<td><input type="text" name="lname ;">
<span id="lname"></span>
</td>
</tr>
<tr>
<td>Email</td>
<td><input name="email"type="text"></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input name="mobile" type="text"></td>
</tr>
<tr>
<td>Password:</td>
<td><input name="password"type="password"></td>
</tr>

<tr>
<td>Gender:</td>
<td><input name="gender" type="radio" values="female">Female</td>
<td><input name="gender"type="radio" values="male">Male</td>
</tr>
<tr>
<td>Address:</td>
<td><textarea row="5"column="20"> </textarea></td>
</tr>

<tr>
<td><input type="submit"value="Register"name="action" class="btn btn-danger"></td>
</tr>
</table>
</form>
</body>
</html>