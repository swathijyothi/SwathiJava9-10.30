<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
<%@page import="com.controller.StudentController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</head>
<body>
<%Student s=(Student)request.getAttribute("s");%>
<input type="hidden" name="id" value="<%=s.getId()%>">
<table class="table table-striped">

<tr>
<th>ID</th>

<th>First Name</th>

<th>Last Name</th>

<th>Email</th>

<th>Mobile</th>

<th>Gender</th>

<th>password</th>
</tr>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getFname() %></td>
<td><%=s.getLname() %></td>
<td><%=s.getEmail() %></td>
<td><%=s.getMobile() %></td>
<td><%=s.getGender() %></td>
<td><%=s.getPassword() %></td>
</tr>
</table>

</body>
</html>