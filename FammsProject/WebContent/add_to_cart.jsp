<%@page import="com.bean.Product"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Wishlist"%>
<%
int pid=Integer.parseInt(request.getParameter("pid"));
int uid=Integer.parseInt(request.getParameter("uid"));
Product p=ProductDao.getProductById(pid);
Cart c=new Cart();

c.setPid(pid);
c.setUid(uid);
c.setProduct_price(p.getProduct_price());
c.setProduct_qty(1);
c.setTotal_price(p.getProduct_price());
CartDao.addToCart(c);
response.sendRedirect("mycart.jsp");







%>