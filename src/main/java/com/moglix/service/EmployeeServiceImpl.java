package com.moglix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.dao.IEmployeeRepository;
import com.moglix.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repository;
	
	@Override
	public Employee insertEmployee(Employee employee) {
		employee = repository.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployee(String name) {
		return repository.findByName(name);
	}

}
