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
 <!-- Basic -->
      <meta charset="utf-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <!-- Mobile Metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
      <!-- Site Metas -->
      <meta name="keywords" content="" />
      <meta name="description" content="" />
      <meta name="author" content="" />
      <link rel="shortcut icon" href="images/student.png" type="">
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
<body class="sub_page">
<%@include file="header.jsp" %>
 
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



<table class="table table-bordered">
<tr>
<th>Id</th>
<th> First Name</th>
<th> Last Name</th>
<th> Email</th>
<th>Mobile</th>
<th>Address</th>
<th>Gender</th>
<th> Password</th>
<th> Confirm Password</th>


</tr>
<tr>
<%List<Student>list=StudentDao.getAllStudent();
    		  for(Student s1:list){%>
   <td><%=s1.getId() %></td>
 <td><%=s1.getFname() %></td>  
   <td><%=s1.getLname() %></td>
   <td><%=s1.getEmail() %></td>
   <td><%=s1.getMobile() %></td>
   <td><%=s1.getAddress() %></td>
   <td><%=s1.getGender() %></td>
   <td><%=s1.getPassword() %></td>
   <td><%=s1.getCpassword() %></td>
  <td>

</td>
</tr>
<%} %>

</table>


</form>
</body>
</html>