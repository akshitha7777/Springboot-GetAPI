package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    EmployeeRepository empRepository;
	
	public List<Employee> getEmployees() {
	    return empRepository.findAll();
	}


}

