<%@page import="com.bean.Student"%>
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
<form name="student" action="StudentController" method="post">
<h1 align="center">STUDENT INFO</h1>
<table align="center">
<input type="hidden" name="id" value="<%= s.getId()%>">
<tr>
<td> First Name:</td>
<td><input type="text" name="fname" value="<%=s.getFname()%>"></td>
</tr>
<tr>
<td> Last Name:</td>
<td><input type="text" name="lname" value="<%=s.getLname() %>"></td>
</tr>
<tr>
<td> Email:</td>
<td><input type="text" name="email" value="<%=s.getEmail() %>">></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile" value="<%=s.getMobile() %>">></td>
</tr>
<tr>
<td> Gender:</td>
<%if(s.getGender().equals("male")){ %>
<td><input type="radio" name="gender" value="male" checked="checked">Male</td>
<td><input type="radio" name="gender" value="female">Female</td>
<% }else if(s.getGender().equals("female")){%>
<td><input type="radio" name="gender" value="male" checked="checked">Male</td>
<td><input type="radio" name="gender" value="female">Female</td>
<%}else{ %>
<td><input type="radio" name="gender" value="male" >Male</td>
<td><input type="radio" name="gender" value="female">Female</td>
<%} %>
</tr>
<tr>
<td> Password:</td>
<td><input type="password" name="password" value="<%=s.getPassword() %>">></td>
</tr>
<br>
<tr>

<td><input type="submit" name="action" value="update" class="btn btn-danger"></td>
</tr>
</table>


</form>

</body>
</html>