package com.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductRepository;
import com.spring.main.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productrepository;
	
	public Product addProduct(Product p)
	{
		return productrepository.save(p);
	}
	
	public List<Product> getProduct()
	{
		return productrepository.findAll();
	}
	public Product updateProduct(Product p)
	{
		return productrepository.save(p);
	}
	

	
		
	}

