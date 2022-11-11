<%@page import="java.util.Random"%>
<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Wishlist"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
 	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000000);
 %>
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
            
           
              
            <div class="row">
               
               <%
               
               
              List<Cart>list=CartDao.getPendingCartById(u.getUid(), "paid");
    		  for(Cart c:list)
    		  {
    			 
    			  Product p=ProductDao.getProductById(c.getPid());
               %>
               <div class="col-sm-6 col-md-4 col-lg-3">
                  <div class="box">
                     
                     <div class="img-box">
                        <img src="Product_Images/<%=p.getProduct_image() %>" alt="">
                     </div>
                     <div class="detail-box">
                        <h6>
                           <%=p.getProduct_name() %>
                        </h6>
                        <h6>
                         Price:  Rs.<%=c.getProduct_price() %>
                        </h6>
                      <h6>
                         Description:<%=p.getProduct_description()%>
                        </h6>
                  </div>
                   <div class="detail-box">
                        <form name="change_qty" method="post" action="CartController">
                        <input type="hidden" name="cid" value=<%=c.getCid() %> >
                         Quantity: 
                         <input type="number" min="1" max="10" value=<%=c.getProduct_qty() %> name="product_qty" onchange="this.form.submit()">
                        </form>
                        <h6>
                         Total Price: <p style="color:red"> Rs.<%=c.getTotal_price() %></p>
                        </h6>
                     
                  </div>
               </div>
            </div>
            <%} %>
            
           
            </div>
           
         </div>
      </section>
      <!-- end product section -->
     
      <!-- footer section -->
      <footer class="footer_section">
         <div class="container">
            <div class="row">
               <div class="col-md-4 footer-col">
                  <div class="footer_contact">
                     <h4>
                        Reach at..
                     </h4>
                     <div class="contact_link_box">
                        <a href="">
                        <i class="fa fa-map-marker" aria-hidden="true"></i>
                        <span>
                        Location
                        </span>
                        </a>
                        <a href="">
                        <i class="fa fa-phone" aria-hidden="true"></i>
                        <span>
                        Call +01 1234567890
                        </span>
                        </a>
                        <a href="">
                        <i class="fa fa-envelope" aria-hidden="true"></i>
                        <span>
                        demo@gmail.com
                        </span>
                        </a>
                     </div>
                  </div>
               </div>
               <div class="col-md-4 footer-col">
                  <div class="footer_detail">
                     <a href="index.jsp" class="footer-logo">
                     Famms
                     </a>
                     <p>
                        Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with
                     </p>
                     <div class="footer_social">
                        <a href="">
                        <i class="fa fa-facebook" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-twitter" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-linkedin" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-instagram" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-pinterest" aria-hidden="true"></i>
                        </a>
                     </div>
                  </div>
               </div>
               <div class="col-md-4 footer-col">
                  <div class="map_container">
                     <div class="map">
                        <div id="googleMap"></div>
                     </div>
                  </div>
               </div>
            </div>
            <div class="footer-info">
               <div class="col-lg-7 mx-auto px-0">
                  <p>
                     &copy; <span id="displayYear"></span> All Rights Reserved By
                     <a href="https://html.design/">Free Html Templates</a><br>
         
                     Distributed By <a href="https://themewagon.com/" target="_blank">ThemeWagon</a>
                  </p>
               </div>
            </div>
         </div>
      </footer>
      <!-- footer section -->
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