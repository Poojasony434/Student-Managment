package com.ps.serviceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.entity.StudentEntity;
import com.ps.repository.StudentRepo;
import com.ps.serviceInterface.StudentIntf;
@Service
public class StudentImpl implements StudentIntf {
	
	@Autowired
	private StudentRepo repo;
	@Override
	public StudentEntity saveStudent(StudentEntity stu) {
		return repo.save(stu);
	}

	@Override
	public Optional<StudentEntity> getStudentById(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		
		
		return repo.findAll();
	}


	@Override
	public String deleteStudentById(Integer id) {
		
		StudentEntity stu=repo.findById(id).get();
			
			if(stu!=null) {
				repo.delete(stu);
				return "Product Delete Sucessfully";
			}
			
			return "Something wrong on server";
		
	}

	@Override
	public StudentEntity editStudent(StudentEntity stu, Integer id) {
		StudentEntity s = repo.findById(id).get();
		s.setBranch(stu.getBranch());
		s.setPhoneNo(stu.getPhoneNo());
		s.setEmail(stu.getEmail());

		return repo.save(s);
		
		
		
	}

}
