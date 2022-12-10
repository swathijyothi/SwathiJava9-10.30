<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.bo.EmpBo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
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
<table class="table table-striped">
<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<%
ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
EmpBo ebo=(EmpBo)a.getBean("empBo");
List<Employee>list=ebo.getAllEmployee();
for(Employee e:list){

%>
<tr>
<th><%=e.getId() %></th>
<th><%=e.getFname()%></th>
<th><%=e.getLname() %></th>
<th><%=e.getEmail() %></th>
<th>
    <form name="edit" method="post" action="EmployeeController" >
     <input type="hidden" name="id" value=""<%=e.getId() %>>
     <input type="submit" name="action" value="Edit" class="btn btn-primary">
    </form>
</th>
<th>
    <form name="delete" method="post" action="EmployeeController" >
     <input type="hidden" name="id" value=""<%=e.getId() %>>
     <input type="submit" name="action" value="Delete" class="btn btn-danger">
    </form>
</th>
</tr>
<%} %>
</table>
</body>
</html>