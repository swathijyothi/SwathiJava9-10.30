<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
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

Cart c=(Cart)request.getAttribute("c");%>
<h1 align="center">CART</h1>
<form action="CartController" method="post" name="insert">
<table class="table">
<tr>
<%-- <input type="hidden" name="id" value="<%=c.getCartId()%>"> --%>
<td>Name:</td>
<td><input type="text"name="name"></td>
</tr>
<tr>
<td>Total:</td>
 <td><input type="number"  name="total" onchange="this.form.submit()"></td>
</tr>
<tr>

<td><input type="submit"name="action" value="add to cart" class="btn btn-danger"></td>
</tr>
</table>
</form>
</body>
</html>