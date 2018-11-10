package com.sampleproject.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.sampleproject.app.model.Employee;
import com.sampleproject.app.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(), HttpStatus.OK);
	}

	@PostMapping("employee")
	public ResponseEntity<Void> createEmployee(@RequestBody Employee employee, UriComponentsBuilder builder) {
		employeeService.createEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@PutMapping("employee")
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.OK);
	}

	@DeleteMapping("employee")
	public ResponseEntity<Void> deleteEmployee(@RequestParam("id") Long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
