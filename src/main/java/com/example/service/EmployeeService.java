package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	
	  List<Employee> getAllEmployeeCodes();
	  Employee getEmployeeByCode(String code);

}
