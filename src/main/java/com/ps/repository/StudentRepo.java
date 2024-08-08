package com.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
