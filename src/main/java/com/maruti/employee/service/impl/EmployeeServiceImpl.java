package com.maruti.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maruti.employee.model.Employee;
import com.maruti.employee.repo.EmployeeRepo;
import com.maruti.employee.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
	private EmployeeRepo emRepo;
	@Override
	public Employee saveEmp(Employee employee) {
		Employee emp = emRepo.save(employee);
		return emp;
	}

}
