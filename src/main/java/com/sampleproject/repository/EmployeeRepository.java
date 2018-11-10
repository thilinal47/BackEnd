package com.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampleproject.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
