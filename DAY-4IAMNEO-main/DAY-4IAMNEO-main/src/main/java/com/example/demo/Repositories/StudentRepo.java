package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Student;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer>{
	

}