package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;
 
@Service
public class EmployeeServiceImpl  implements EmployeeService {

	

	    @Autowired
	    private EmployeeDAO employeeDAO;

	    @Override
	    public List<Employee> getAllEmployeeCodes() {
	        return employeeDAO.getAllEmployeeCodes();
	    }

	    @Override
	    public Employee getEmployeeByCode(String code) {
	        return employeeDAO.getEmployeeByCode(code);
	    }
}
