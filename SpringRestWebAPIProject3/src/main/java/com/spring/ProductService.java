package com.spring;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	//display all data
	public List<Product> listAll(){
		return repo.findAll();
	}
	//Insert data in table
	public void save(Product product) {
		repo.save(product);
	}
	public Product productById(Integer id) {
		return repo.findById(id).get();
	}
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}
	public List<Product> getByKeyword(String keyword) {
		
		return repo.findByKeyword(keyword);
	}
	public List<Product> getAllProducts() {
		 List<Product> list =  (List<Product>)repo.findAll();
		  return list;
		
	}
	
	}
	


