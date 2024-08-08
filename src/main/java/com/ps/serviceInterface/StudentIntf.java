package com.ps.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.ps.entity.StudentEntity;

public interface StudentIntf {
	public	Optional<StudentEntity> getStudentById(Integer id);
	
	public List<StudentEntity> getAllStudents();
	
	public StudentEntity saveStudent(StudentEntity stu);
	
	public String  deleteStudentById(Integer id);
	
	public StudentEntity  editStudent(StudentEntity stu,Integer id);
	
	

}
