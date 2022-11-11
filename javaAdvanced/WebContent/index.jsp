<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>



</head>
<body>
<form name="insert" method="post" action="EmployeeController">
<h1 align="center">Employee Registration</h1>
<br><br>
<table align="center">
	<tr>
	<td>First Name</td>
	<td><input type="text" name="fname" ></td>
	<td><span id="fname"></span></td>
	</tr>
	<tr>
	<td>Last Name</td>
	<td><input type="text" name="lname" ></td>
	</tr>
	<tr>	
	<td>Email</td>
	<td><input type="text" name="email" ></td>
	<td><span id="email"></span></td>
	</tr>
	<tr>	
	<td>Mobile</td>
	<td><input type="text" name="mobile" ></td>
	<td><span id="mobile"></span></td>
	</tr>
	<tr>	
	<td>Address</td>
	<td><textarea name="address" rows="3" cols="18"></textarea></td>
	</tr>
	<tr>	
	<td>Gender</td>
	<td><input type="radio" name="gender" value="Male">Male
	<input type="radio" name="gender" value="Female">Female</td>
	</tr>
	
	<tr>		
	<td align="center"><br><input type="submit" value="Insert" name="action" class="btn btn-danger"></td>
	</tr>
		
	
	
</table>
</form>
</body>
</html>