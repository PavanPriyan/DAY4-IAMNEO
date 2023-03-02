package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;
import com.example.demo.Service.Apiservice;


@RestController
public class ApiController {
	@Autowired
	StudentRepo repo;
	@Autowired
	Apiservice s2;
	@GetMapping("/")
	List<Student> getlist()
	{
		return repo.findAll();
	}
	@PostMapping("/post")
	public Student create(@RequestBody Student d)
	{
		return repo.save(d);
	}
	@GetMapping("/get/{id3}")
	public Optional<Student> getbyid(@PathVariable int id3){
		return s2.getdetails(id3);
	}
	@PutMapping("/update")
	public String puti(@RequestBody Student stu)
	{
		return s2.updated(stu);
	}
	@DeleteMapping("/delete/{id3}")
	public String del(@PathVariable int id3)
	{
		return s2.deletebyid(id3);
	} 

}
