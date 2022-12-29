<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
<table class="table">
<tr>
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="emp" items="${employees}">
<tr>
 <td>${emp.id}</td>
 <td>${emp.fname}</td>
 <td>${emp.lname}</td>
 <td>${emp.email}</td>
 <td>
 <a href="updatepage.jsp?id=${emp.id}&fname=${emp.fname}&lname=${emp.lname}&email=${emp.email}">Edit</a>
 </td>
 <td>
 <a href="EmpController?id=${emp.id}&action=delete">Delete</a>
 </td>
</tr>
</c:forEach>


</table>
</body>
</html>