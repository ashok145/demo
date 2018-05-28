/**
 * 
 */
package com.moglix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moglix.model.Employee;


public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

	@SuppressWarnings("unchecked")
	public Employee save(Employee employee);
	
	public Employee findByName(String name);
}
