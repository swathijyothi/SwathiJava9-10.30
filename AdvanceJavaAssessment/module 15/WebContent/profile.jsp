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
                     <h3>Profile</h3>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end inner page section -->
      <!-- why section -->
      <section class="why_section layout_padding">
         <div class="container">
          
          
            <div class="row">
               <div class="col-lg-8 offset-lg-2">
                  <div class="full">
                     <form name="profile" method="post" action="StudentController">
                     <input type="hidden" name="id" value="<%=s.getId() %>">
 <table align="center">
 <tr>
<td> First Name:</td>
<td><input type="text" name="fname" value="<%=s.getFname() %>"required></td>
</tr>
<tr>
<td> Last Name:</td>
<td><input type="text" name="lname" value="<%=s.getLname() %>" required></td>
</tr>
<tr>
<td> Email:</td>
<td><input type="text" name="email" value="<%=s.getEmail()%>" readonly="readonly"></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile" value="<%=s.getMobile()%>" required></td>
</tr>
<tr>
<td>Address:</td>
<td><textarea rows="3" cols="10" name="address" required><%=s.getAddress() %></textarea> </td>
</tr>
<tr>
<td> Gender:</td>
<%if(s.getGender().equals("male")){ %>
<td><input type="radio" name="gender" value="male"  checked="checked" required>Male</td>
<td><input type="radio" name="gender" value="female" required>Female</td>
<%}else if(s.getGender().equals("female")) {%>
<td><input type="radio" name="gender" value="male" required >Male</td>
<td><input type="radio" name="gender" value="female"  checked="checked" required>Female</td>
<%} else{%>
<td><input type="radio" name="gender" value="male" required >Male</td>
<td><input type="radio" name="gender" value="female"  checked="checked"required>Female</td>
<%} %>
</tr>
<tr>
<td> Password:</td>
<td><input type="password" name="password" value="<%=s.getPassword()%>" required></td>
</tr>
<tr>
<td> Confirm Password:</td>
<td><input type="password" name="cpassword" value="<%=s.getCpassword()%>" required></td>
</tr>

<tr>
<td><input type="submit" name="action" value="update" class="btn btn-danger"></td>
</tr>
</table>
                        
                     </form>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end why section -->
     >   </body>
</html>         