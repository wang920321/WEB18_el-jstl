package com.itheima.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;

public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//传递请求到service层
		ProductService productService=new ProductService();
		List<Product> productList=null;
		try {
			productList= productService.findAllProduct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//全部商品的数据准备好了转发给jsp进行数据显示
		HttpSession session = req.getSession();
		session.setAttribute("productList", productList);
		req.getRequestDispatcher("/product_list.jsp").forward(req, res);
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}