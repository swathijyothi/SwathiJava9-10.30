package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Cart;
import com.dao.CartDao;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int cid= Integer.parseInt(request.getParameter("cid"));
		int product_qty =  Integer.parseInt(request.getParameter("product_qty"));
		
		Cart c=CartDao.getCartProductById(cid);
		c.setProduct_qty(product_qty);
		int total_price= c.getProduct_price()*product_qty;
		c.setTotal_price(total_price);
		CartDao.updateToCart(c);
		response.sendRedirect("mycart.jsp");
	}

}
