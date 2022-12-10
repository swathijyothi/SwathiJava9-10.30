<%@page import="com.dao.StudentDao"%>
<%@page import="com.bean.Student"%>
<%@page import="com.bean.Address"%>
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
<%Address a=(Address)request.getAttribute("a");
Student s=StudentDao.getStudentById(Integer.parseInt(request.getParameter("aid")));
%>
<h1 align="center">Student Info</h1>
<form action="StudentController" method="post" name="update">
<input type="hidden" name="aid"value="<%=a.getAid() %>">
<table align="center">

<tr>
<td>Student name:</td>
<td><input type="text" name="sname" value="<%=s.getSname() %>"></td>
</tr>
<tr>
<td>Street:</td>
<td><input type="text" name="street"value="<%=a.getStreet() %>"></td>
</tr>
<tr>
<td>City:</td>
<td><input type="text" name="city"value="<%=a.getCity() %>"></td>
</tr>
<tr>
<td>State:</td>
<td><input type="text" name="state" value="<%=a.getState() %>"></td>
</tr>
<tr>
<td>Zip Code:</td>
<td><input type="text" name="zcode" value="<%=a.getZipcode() %>"></td>
</tr>
<tr>

<td><input type="submit" name="action" value="update" class="btn btn-danger"></td>
</tr>
</table>
</form>
</body>
</html>