package com.moglix.service;

import org.springframework.stereotype.Service;

import com.moglix.model.Employee;

@Service
public interface IEmployeeService {
	public Employee insertEmployee(Employee employee);

	public Employee getEmployee(String name);
}
