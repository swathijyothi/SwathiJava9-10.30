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
                     <h3>STUDENT REGISTRATION</h3>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end inner page section -->

<form name="student" action="StudentController" method="post">

<table align="center">
<tr>
<td> First Name:</td>
<td><input type="text" name="fname"></td>
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
<td> Gender:</td>
<td><input type="radio" name="gender" value="male">Male</td>
<td><input type="radio" name="gender" value="female">Female</td>
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