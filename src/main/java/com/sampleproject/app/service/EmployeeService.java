package com.sampleproject.app.service;

import java.util.List;

import com.sampleproject.app.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	void createEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(Long id);

}
