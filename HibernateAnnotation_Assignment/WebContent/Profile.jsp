<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
   <head>
      <!-- Basic -->
      <meta charset="utf-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <!-- Mobile Metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
      <!-- Site Metas -->
      <meta name="keywords" content="" />
      <meta name="description" content="" />
      <meta name="author" content="" />
      <link rel="shortcut icon" href="images/favicon.png" type="">
      <title>Famms - Fashion HTML Template</title>
      <!-- bootstrap core css -->
      <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
      <!-- font awesome style -->
      <link href="css/font-awesome.min.css" rel="stylesheet" />
      <!-- Custom styles for this template -->
      <link href="css/style.css" rel="stylesheet" />
      <!-- responsive style -->
      <link href="css/responsive.css" rel="stylesheet" />
   </head>
   <%@include file="header.jsp" %>
   <body class="sub_page">
      <div class="hero_area">
        
      </div>
      <!-- inner page section -->
      <section class="inner_page_head">
         <div class="container_fuild">
            <div class="row">
               <div class="col-md-12">
                  <div class="full">
                     <h3>UPDATE REGISTRATION FORM</h3>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end inner page section -->

<form name="student" action="StudentController" method="post">
<%Student s=(Student)request.getAttribute("s"); %>
<table align="center">
<input type="hidden" name="id" value="<%=s.getId() %>">
<tr>
<td> First Name:</td>
<td><input type="text" name="fname" value="<%=s.getFname() %>"></td>
</tr>
<tr>
<td> Last Name:</td>
<td><input type="text" name="lname"value="<%=s.getLname() %>"></td>
</tr>
<tr>
<td> Email:</td>
<td><input type="text" name="email" value="<%=s.getEmail() %>"></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile" value="<%=s.getMobile() %>"></td>
</tr>
<tr>
<td> Gender:</td>
if(gender=male){
<td><input type="radio" name="gender" value="male" checked>Male</td>
<td><input type="radio" name="gender" value="female">Female</td>
}else if(gender=female){
<td><input type="radio" name="gender" value="male" >Male</td>
<td><input type="radio" name="gender" value="female"checked>Female</td>
}else{
<td><input type="radio" name="gender" value="male" >Male</td>
<td><input type="radio" name="gender" value="female"checked></td>
}
</tr>
<tr>
<td> Password:</td>
<td><input type="password" name="password"value="<%=s.getPassword() %>"></td>
</tr>
<br>
<tr>

<td><input type="submit" name="action" value="Insert" class="btn btn-danger"></td>
</tr>
</table>


</form>

</body>
</html>