<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="ValidFilter" method="post">
<h1 align="center">STUDENT INFO</h1>
<table align="center">
<tr>
<td> First Name:</td>
<td><input type="text" name="fname"></td><%
String msg=(String)request.getAttribute("msg");
if(msg!=null){
out.print(msg);
}
%>
</tr>
<tr>
<td> Last Name:</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>
<td> Email:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile"></td>
</tr>

<tr>
<td> Password:</td>
<td><input type="password" name="password"></td>
</tr>
<br>
<tr>

<td><input type="submit" name="action" value="Insert" class="btn btn-danger"></td>
</tr>
</table>


</form>
</body>
</html>