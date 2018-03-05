package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;

public class ProductService {

	public List<Product> findAllProduct() throws SQLException {
		ProductDao dao=new ProductDao();
		List<Product> productList=dao.findAllProduct();
		return productList;
		
		
	}
	public Product findProductById(String pid) throws SQLException{
		ProductDao dao=new ProductDao();
		
		return dao.findProductById(pid);
		
	}

}
