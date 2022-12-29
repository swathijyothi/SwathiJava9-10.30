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
      <script>  
var request=new XMLHttpRequest();  
function searchInfo()
{  
	var name=document.student.email.value;  
	var url="AjaxSearch2.jsp?val="+name;  
  	try
  	{  
		request.onreadystatechange=function()
		{  
			if(request.readyState==4)
			{  
				var val=request.responseText;
				document.getElementById('tops').innerHTML=val;
				/* if(val.includes("Used"))
				{
					alert(val);
					document.getElementById("submit").disabled="true";	
				}
				else if(val.includes("Available"))
				{
					alert(val);
					document.getElementById("submit").disabled="";
				} */
			}  
		}  
		request.open("GET",url,true);  
		request.send();  
	}
  	catch(e)
  	{
  		alert("Unable to connect to server");
  	}  
}  

</script>  
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
 <%
          if(request.getAttribute("msg")!=null){
        	  out.print(request.getAttribute("msg"));
          }%>
<form name="student" action="StudentController" method="post">

<table align="center">
<tr>
<td> First Name:</td>
<td><input type="text" name="fname" onblur="checkFname()" required>
<span id ="fname"></span></td>
</tr>
<tr>
<td> Last Name:</td>
<td><input type="text" name="lname" required></td>
</tr>
<tr>
<td> Email:</td>
<td><input type="text" name="email" onblur="searchInfo()" required>
<span id="tops" class="btn btn-danger"></span></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile" required></td>
</tr>
<tr>
<td>Address:</td>
<td><textarea rows="3" cols="10" name="address" required></textarea></td>
</tr>
<tr>
<td> Gender:</td>
<td><input type="radio" name="gender" value="male" required>Male</td>
<td><input type="radio" name="gender" value="female" required>Female</td>
</tr>
<tr>
<td> Password:</td>
<td><input type="password" name="password" required></td>
</tr>
<tr>
<td> Confirm Password:</td>
<td><input type="password" name="cpassword" required></td>
</tr>
<br>
<tr>

<td><input type="submit" name="action" value="SignUp" class="btn btn-danger"></td>
</tr>
</table>


</form>

</body>
</html>