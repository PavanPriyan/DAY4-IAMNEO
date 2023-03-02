package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;


@Service
public class Apiservice {

	@Autowired
	StudentRepo repo;
	public Optional<Student> getdetails(int id2)
	{
		return repo.findById(id2);
	}
	public String updated(Student stu)
	{
		repo.save(stu);
		return "updated";
	}
	public String deletebyid(int id2)
	{
		repo.deleteById(id2);
		return "Deleted";
	}
}
