<%@page import="com.bean.Employee"%>
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
<%
Employee e= (Employee)request.getAttribute("e");
%>
<form name="update" method="post" action="EmployeeController">
<h1 align="center">UPDATE</h1>
<br>
<table align="center">
<input type="hidden" name="id" value="<%=e.getId()%>">
<tr>

<td >FIRST NAME :</td>
<td><input type="text" name="fname" value="<%=e.getFname()%>"></td>

</tr>
<tr>
<td>LAST NAME :</td>
<td><input type="text" name="lname" value="<%=e.getLname()%>"></td>

</tr>
<tr>
<td>EMAIL :</td>
<td><input type="text" name="email" value="<%=e.getEmail()%>"></td>
</tr>


<tr>
<td align="center"><br><input type="submit" value="INSERT" name="action" class="btn btn-danger"></td>
</tr>

</table>
</form>

</body>
</html>