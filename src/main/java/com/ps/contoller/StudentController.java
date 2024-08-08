package com.ps.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.entity.StudentEntity;
import com.ps.serviceInterface.StudentIntf;



@CrossOrigin
@RestController
public class StudentController {
	@Autowired
	private StudentIntf service;
	@PostMapping("/save")
   public ResponseEntity<StudentEntity>
     saveStudent(@RequestBody StudentEntity stu){
		
	return new ResponseEntity<>(service.saveStudent(stu), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/stuData")
	public ResponseEntity<?> getAllStudents(){
		return new ResponseEntity<>(service.getAllStudents(),HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getstudentById(@PathVariable Integer id){
		return new ResponseEntity<>(service.getStudentById(id), HttpStatus.OK);
		
	}
	
	@GetMapping("/deletestudent/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
		return new ResponseEntity<>(service.deleteStudentById(id), HttpStatus.OK);
		
	}
	
	@PostMapping("/editStudent/{id}")
	public ResponseEntity<?> editProduct(@RequestBody  StudentEntity stu, @PathVariable Integer id) {
		return new ResponseEntity<>(service.editStudent(stu, id), HttpStatus.CREATED);
	}
	

}
