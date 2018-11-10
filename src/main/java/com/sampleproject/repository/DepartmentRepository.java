package com.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampleproject.app.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
