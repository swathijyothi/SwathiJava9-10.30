package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bean.Product;
import com.dao.ProductDao;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512,//512MB
maxFileSize = 1024 * 1024 * 512, //512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("addproduct")) {
			
			String savePath = "C:\\Users\\jyoth\\OneDrive\\Documents\\github\\SwathiJava9-10.30\\FammsProject\\WebContent\\Product_Images";
			File fileSaveDir=new File(savePath);
	        if(!fileSaveDir.exists()){
	            fileSaveDir.mkdir();
	        }
	        Part file1 = request.getPart("product_image");
		 	String fileName=extractfilename(file1);
		    file1.write(savePath + File.separator + fileName);
		    String filePath= savePath + File.separator + fileName ;
			
			Product p=new Product();
			p.setUid(Integer.parseInt(request.getParameter("uid")));
			p.setProduct_category(request.getParameter("product_category"));
			p.setProduct_name(request.getParameter("product_name"));
			p.setProduct_model(request.getParameter("product_model"));
		    p.setProduct_image(fileName);
			p.setProduct_price(Integer.parseInt(request.getParameter("product_price")));
			p.setProduct_description(request.getParameter("product_desc"));
			ProductDao.addProduct(p);
			request.setAttribute("msg"," product add Successfully");
			request.getRequestDispatcher("seller_add_product.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("editproduct")) {
			Product p=new Product();
			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setProduct_category(request.getParameter("product_category"));
			p.setProduct_name(request.getParameter("product_name"));
			p.setProduct_model(request.getParameter("product_model"));
			p.setProduct_price(Integer.parseInt(request.getParameter("product_price")));
			p.setProduct_description(request.getParameter("product_desc"));
			ProductDao.editProduct(p);
			response.sendRedirect("seller_view_product.jsp");
			
		}
	}

}
