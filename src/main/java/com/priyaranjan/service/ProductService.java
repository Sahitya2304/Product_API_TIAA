package com.priyaranjan.service;

import java.util.List;

import com.priyaranjan.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product getProductById(Integer id);
	Product createProduct(Product product);
	Product updateProduct(Integer id,Product product);
	void deleteProduct(Integer id);
	
}
