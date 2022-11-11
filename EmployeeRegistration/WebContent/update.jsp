<%@page import="com.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


</head>
<body>
<%
Employee e=(Employee)request.getAttribute("e");
%>
<form name="update" method="post" action="EmpController">
<h1 align="center">EMPLOYEE REGISTRATION</h1>
<br>

<table align="center">
<input type="hidden" name="id" value="<%=e.getId() %>">
<tr>
<td >FIRST NAME :</td>
<td><input type="text" name="fname" value="<%=e.getFname()%>"></td>
<td><span id="fname"></span>
</tr>
<tr>
<td>LAST NAME :</td>
<td><input type="text" name="lname" value="<%=e.getLname()%>"></td>
<td><span id="lname"></span>
</tr>
<tr>
<td>EMAIL :</td>
<td><input type="text" name="email" value="<%=e.getEmail()%>"></td>
<td><span id="email"></span>
</tr>
<tr>
<td>MOBILE :</td>
<td><input type="text" name="mobile" value="<%=e.getMobile()%>"></td>
<td><span id="mobile"></span>
</tr>
<tr>
<td>GENDER:</td>

<%
if(e.getGender().equals("male")) {
%>
    <td><input type="radio" name="gender" value="male" checked="checked">MALE</td>
	<td><input type="radio" name="gender" value="male">Female</td>
<%
}
else if(e.getGender().equals("female")) {
%>
<td><input type="radio" name="gender" value="male" checked="checked">MALE</td>
	<td><input type="radio" name="gender" value="male">Female</td>
<%
}else{
	%>
	<td><input type="radio" name="gender" value="male">MALE</td>
	<td><input type="radio" name="gender" value="male">Female</td>
	<%} %>
</tr>
<tr>
<td>ADDRESS :</td>
<td><textarea name="address"  rows="3" cols="22"><%=e.getAddress()%></textarea></td>

</tr>
<tr>
<td align="center"><br><input type="submit" value="UPDATE" name="action" class="btn btn-danger"></td>
</tr>

</table>
</form>
</body>
</html>