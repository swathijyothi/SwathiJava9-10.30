<%@page import="com.bean.Address"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
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

<table class="table">
<tr>
<th>aid</th>
<th>Street</th>
<th>City</th>
<th>State</th>
<th>zip code</th>
<th>Student name</th>
<th>S id</th>
<th>Edit</th>
<th>Delete</th>

</tr>

<% 
List<Student>list=StudentDao.getAllStudent();
List<Address>list1=StudentDao.getAllAddress();
for(Address a:list1){
Student s=StudentDao.getStudentById(a.getAid());%>
<tr>
<td><%=a.getAid() %></td>
<td><%=a.getStreet() %></td>
<td><%=a.getCity() %></td>
<td><%=a.getState() %></td>
<td><%=a.getZipcode() %></td>
 <td> <%=s.getSname() %></td>
<td> <%=s.getSid() %></td>
<td>
<form name="edit" method="post" action="StudentController">
<input type="hidden" name="aid" value="<%=a.getAid() %>">
<input type="submit" name="action"  value ="Edit" class="btn btn-primary">
</form>
</td>
<td>
<form name="delete" method="post" action="StudentController">
<input type="hidden" name="aid" value="<%=a.getAid() %>">
<input type="submit" name="action" value="Delete" class="btn btn-danger">
</form>
</td>
</tr>
<%} %>
</table>

</body>
</html>
