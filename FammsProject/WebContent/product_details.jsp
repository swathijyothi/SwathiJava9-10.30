<%@page import="com.dao.CartDao"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.ProductDao"%>
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
                     <h3>Product Grid</h3>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end inner page section -->
      <!-- product section -->
      <section class="product_section layout_padding">
         <div class="container">
            <div class="heading_container heading_center">
               <h2>
                  Our <span>products</span>
               </h2>
            </div>
            <div class="row">
                <%
               int pid = Integer.parseInt(request.getParameter("pid"));
               Product p = ProductDao.getProductById(pid);
               %>
              
               <div class="col-sm-15 col-md-6 col-lg-6">
                  <div class="box">
                     <div class="option_container">
                        <div class="options">
                        
                        <% 
                       
                        if(session.getAttribute("u")!=null)
                        {
                        	 boolean flag = WishlistDao.checkwishlist(p.getPid(),u.getUid());
                        	   if(flag==false){
                        %>
                          
                           <a href="add_to_wishlist.jsp?pid=<%=p.getPid() %>&uid=<%=u.getUid() %>" class="option1">
                           Add To wishlist
                           </a>
                           <%
                           }
                              else {
                        %>
                         
                           <a href="remove_from_wishlist.jsp?pid=<%=p.getPid()%>&uid=<%=u.getUid() %>" class="option1">
                           Remove from wishlist
                       </a>
                        <% } 
                        }
                        else{
                        %>
                        <a href="login.jsp" class="option1">
                        Login
                        </a>
                        <%
                        }
                        
                        %>
                        
               </div>
                <div class="options">
                        
                        <% 
                       
                        if(session.getAttribute("u")!=null)
                        {
                        	 boolean flag = CartDao.checkcart(p.getPid(),u.getUid());
                        	   if(flag==false){
                        %>
                           
                           <a href="add_to_cart.jsp?pid=<%=p.getPid() %>&uid=<%=u.getUid() %>" class="option1">
                           Add To cart
                           </a>
                           <%
                           }
                              else {
                        %>
                         
                           <a href="remove_from_cart.jsp?pid=<%=p.getPid()%>&uid=<%=u.getUid() %>" class="option1">
                           Remove from cart
                       </a>
                        <% } 
                        }
                        else{
                        %>
                        <a href="login.jsp" class="option1">
                        Login
                        </a>
                        <%
                        }
                        
                        %>
                        </div>
                     </div>
                     <div class="img-box">
                        <img src="Product_Images/<%=p.getProduct_image() %>" alt="">
                     </div>
                     <div class="detail-box">
                        <h6>
                           <%=p.getProduct_name() %>
                        </h6>
                        <h6>
                           Rs.<%=p.getProduct_price() %>
                        </h6>
                        <br>
                        <h6>
                        Description: <%=p.getProduct_description() %>
                        </h6>
                     
                  </div>
               
            </div>
            
            </div>
           
         </div>
      </section>
      <!-- end product section -->
     
      <!-- jQery -->
      <script src="js/jquery-3.4.1.min.js"></script>
      <!-- popper js -->
      <script src="js/popper.min.js"></script>
      <!-- bootstrap js -->
      <script src="js/bootstrap.js"></script>
      <!-- custom js -->
      <script src="js/custom.js"></script>
   </body>
</html>