<%@page import="java.util.List"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.CartDao"%>
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
<form action="CartController" method="post" name="insert">
<h1 align="center">ITEM</h1>
<table class="table">
<tr>
<td>Item Id:</td>
<td><input type="text"name="itemid"></td>
</tr>
<tr>
<td>Item Total:</td>
<td><input type="text"name="itotal"></td>
</tr>
<tr>
<tr>
<td>Quantity:</td>
<td><input type="text"name="quantity"></td>
</tr>
<tr>
<tr>
<td>Cart Name:</td>
<td><select name="cart">
<option>----SELECT CART----</option>
<%List<Cart>list=CartDao.getAllCart();
for(Cart c:list){
%>
<option value="<%=c.getCartId() %>"><%=c.getName() %></option>
<%} %>
</select></td>
</tr>
<tr>
<td><input type="submit"name="action" value="add item" class="btn btn-danger"></td>
</tr>
</table>
</form>
</body>
</html>