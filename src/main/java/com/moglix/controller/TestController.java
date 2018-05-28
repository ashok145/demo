package com.moglix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.model.Employee;
import com.moglix.service.IAwsService;
import com.moglix.service.IEmployeeService;

@RestController
@RequestMapping("api/")
public class TestController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	private IAwsService awsService;
	
	@GetMapping("greet/")
	public String greetPeople() {
		return "Hello ";
	}
	
	@PostMapping("insert/employee/")
	public Employee insertEmployee(@RequestBody Employee employee) {
		employeeService.insertEmployee(employee);
		return employee;
	}
	
	@PostMapping("aws/insert/employee/")
	public Employee insertEmployeeInAWS(@RequestBody Employee employee) {
		awsService.insertIntoAws(employee);
		return employee;
	}
}
