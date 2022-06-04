package com.maruti.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.maruti.employee.model.Employee;
import com.maruti.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService emService;
	
	@PostMapping("/insertEmp")
	public ResponseEntity<?> saveEmp(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(emService.saveEmp(employee),HttpStatus.OK);
	}
	
}
