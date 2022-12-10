package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Cart;
import com.bean.Item;
import com.dao.CartDao;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		Double total=null;
		if(action.equalsIgnoreCase("add to cart")) {
			Cart c=new Cart();
			c.setCartId(Integer.parseInt(request.getParameter("id")));
			c.setName(request.getParameter("name"));
			CartDao.insertCart(c);
			request.setAttribute("c", c);
			request.getRequestDispatcher("cart.jsp").forward(request, response);
			//response.sendRedirect("cart.jsp");
		}
		if(action.equalsIgnoreCase("add item")) {
			Item it=new Item();
			it.setItemId(request.getParameter("itemid"));
			it.setQuantity(Integer.parseInt(request.getParameter("quantity")));
			it.setItemTotal(Double.parseDouble(request.getParameter("itotal")));
			int id=Integer.parseInt(request.getParameter("cart"));
			Cart c=CartDao.getCartById(id);
			it.setCart(c);
			Cart c1=new Cart();
			int cid=Integer.parseInt(request.getParameter("cart"));
			List<Item>list=CartDao.getItemListById(cid);
			for(Item t:list) {
			 total=((it.getQuantity())*(it.getItemTotal()))+total;
			}
			c1.setTotal(total);
			CartDao.insertItem(it);
			response.sendRedirect("item.jsp");
			
		}
	}

}
