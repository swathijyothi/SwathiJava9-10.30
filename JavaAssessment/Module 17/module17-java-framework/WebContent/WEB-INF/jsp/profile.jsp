<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<title>Bootstrap Simple Login Form with Blue Background</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<style type="text/css">
body {
	  background: #BA68C8;
	}

	.form-control:focus {
	  box-shadow: none;
	  border-color: #BA68C8;
	}

	.profile-button {
	  background: #BA68C8;
	  box-shadow: none;
	  border: none;
	}

	.profile-button:hover {
	  background: #682773;
	}

	.profile-button:focus {
	  background: #682773;
	  box-shadow: none;
	}

	.profile-button:active {
	  background: #682773;
	  box-shadow: none;
	}

	.back:hover {
	  color: #682773;
	  cursor: pointer;
	}
</style>
</head>
<body>
 <%User u=(User)request.getAttribute("u");%>
<div class="container rounded bg-white mt-5">
        <div class="row">
            <div class="col-md-4 border-right">
                <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" src="images/<%=u.getImage() %>" width="90"></div>
            </div>
            <div class="col-md-8">
                <div class="p-3 py-5">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <div class="d-flex flex-row align-items-center back"><i class="fa fa-long-arrow-left mr-1 mb-1"></i>
                            
                        </div>
                        <h1 align="center">Edit Profile</h1>
                       
                    </div>
                    <form action="saveprofile" method="post" name="profile">
                    <div><input type="hidden" name="id" value="<%=u.getId()%>"></div>
                      First Name:
                    <div class="row mt-2">
                  
                        <div class="col-md-6"><input type="text" class="form-control" placeholder="first name" name="fname" value="<%=u.getFname()%>"></div>
                        
                    </div>
                    Last Name:
                    <div class="row mt-2">
                        <div class="col-md-6"><input type="text" class="form-control" placeholder="last name" name="lname" value="<%=u.getLname()%>"></div>
                       
                    </div>
                    Email:
                    <div class="row mt-3">
                        <div class="col-md-6"><input type="text" class="form-control" placeholder="Email" name="email" value="<%=u.getEmail()%>"></div>
                        
                    </div>
                    Password:
                    <div class="row mt-3">
                        <div class="col-md-6"><input type="text" class="form-control" placeholder="password" name="password" value="<%=u.getPassword()%>"></div>
                        
                    </div>
                   </div>
                   Confirm Password:
                    <div class="row mt-3">
                        <div class="col-md-6"><input type="text" class="form-control" placeholder="confirm password" name="cpassword" value="<%=u.getCpassword()%>"></div>
                        
                    </div>
                     </div>
                     Image:
                    <div class="row mt-3">
                        
                   <div><img src="images/<%=u.getImage() %>" width="300px" height="200px"></div>
            </div>
                    </div>
                    <div class="mt-5 text-right">
                    <button class="btn btn-primary profile-button" type="submit" name="action" value="saveprofile">Save Profile</button>
                    
                     <a class="nav-link" href="logout">Logout</a>
                    </div>
                     
                     </form>
                </div>
               
            </div>
        </div>
    </div>
</body>
</html>