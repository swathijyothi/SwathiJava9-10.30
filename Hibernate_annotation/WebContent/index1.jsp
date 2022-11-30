<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<form name="insert" method="post" action="EmployeeController">
<h1 align="center">EMPLOYEE REGISTRATION</h1>
<br>
<table align="center">
<tr>
<td >FIRST NAME :</td>
<td><input type="text" name="fname"></td>
<td><span id="fname"></span>
</tr>
<tr>
<td>LAST NAME :</td>
<td><input type="text" name="lname"></td>
<td><span id="lname"></span>
</tr>
<tr>
<td>EMAIL :</td>
<td><input type="text" name="email"></td>
<td><span id="email"></span>
</tr>
<tr>
<td>MOBILE :</td>
<td><input type="text" name="mobile"></td>
<td><span id="mobile"></span>
</tr>
<tr>
<td>GENDER:</td>
<td><input type="radio" name="gender" value="male">MALE</td>
<td><input type="radio" name="gender" value="female">Female</td>
</tr>
<tr>
<td>ADDRESS :</td>
<td><textarea name="address"  rows="3" cols="22"></textarea></td>

</tr>
<tr>
<td align="center"><br><input type="submit" value="INSERT" name="action" class="btn btn-danger"></td>
</tr>

</table>
</form>

</body>
</html>