package com.spring;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {

@Autowired
private StudentService obj;

@GetMapping("/hello")
public String hello() 
    {
		return "Welcome to RestAPI Spring Application";
	}

@GetMapping("/getStudent")
public List<Student> getStudent() 
    {
		return this.obj.getStudent();
	}

@PostMapping("/addStudent")
public Student addStudent(@RequestBody Student student)

	{
		return this.obj.addStudent(student);
	}

}
