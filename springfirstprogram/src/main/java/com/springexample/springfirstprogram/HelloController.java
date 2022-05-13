package com.springexample.springfirstprogram;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
public class HelloController {
	
	/*@RequestMapping("/hello")
	public String sayHello() {
		return "FirstSpring";*/
		
	@PostMapping("/postmap")
	//post Mapping with arguments
	public String postMethod(String str) {
		//str="HelloPavani";
		return "Welcome"+str;
	
	/*@RequestMapping("/pavani")
	public String sayPavani() {
		return "HelloGanesh";*/
	}
		
	
	}
		
	
	

	
		
	
	


