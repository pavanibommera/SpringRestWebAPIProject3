package com.spring.controller;

import java.util.List;



import javax.validation.Valid;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.Product;
import com.spring.service.ProductService;

@Controller
public class ProductController {
	
@Autowired
private ProductService obj;

@GetMapping("/home")
public String homepage() {
	return "Welcome to Edubridge";
}

@GetMapping("/display")
public List<Product>getProduct(){
	return obj.getProduct();
}

@PostMapping("/insert")
public Product addProduct(@RequestBody Product product) {
     return obj.addProduct(product);
}

@PutMapping("/update")
public Product updateProduct(@RequestBody Product product) {
	return obj.updateProduct(product);
}
}
