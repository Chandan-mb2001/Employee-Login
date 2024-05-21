package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Employee;
import com.example.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String showEmployeeForm(Model model) {
        List<Employee> employees = employeeService.getAllEmployeeCodes();
        model.addAttribute("employees", employees);
        return "employeeForm";
    }

    @PostMapping("/getEmployee")
    public String getEmployee(@RequestParam("code") String code, Model model) {
        Employee employee = employeeService.getEmployeeByCode(code);
        model.addAttribute("employee", employee);
        return "employeeDetails";
    }
}
